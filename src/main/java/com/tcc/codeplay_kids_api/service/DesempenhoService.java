package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.Aluno;
import com.tcc.codeplay_kids_api.entity.RelatorioAtividade;
import com.tcc.codeplay_kids_api.repository.AlunoRepository;
import com.tcc.codeplay_kids_api.repository.RelatorioAtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DesempenhoService {

    @Autowired
    private RelatorioAtividadeRepository relatorioAtividadeRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    public Map<String, Object> getDesempenhoPorAluno(Long alunoId) {
        List<RelatorioAtividade> relatorios = relatorioAtividadeRepository.findByAlunoId(alunoId);

        return calcularEstatisticas(relatorios);
    }

    public Map<String, Object> getDesempenhoPorTurma(Long turmaId) {
        Optional<List<Aluno>> alunos = alunoRepository.getByTurmaId(turmaId);
        if (alunos.isPresent()) {
            List<RelatorioAtividade> relatorios = new ArrayList<>();
            alunos.get().forEach(aluno -> {
                List<RelatorioAtividade> relatoriosDoAluno = relatorioAtividadeRepository.findByAlunoId(aluno.getId());
                relatorios.addAll(relatoriosDoAluno);
            });

            return calcularEstatisticas(relatorios);
        }
        return null;
    }

    private Map<String, Object> calcularEstatisticas(List<RelatorioAtividade> relatorios) {
        if (relatorios.isEmpty()) {
            return Collections.singletonMap("mensagem", "Nenhum dado encontrado.");
        }

        // Estatísticas gerais
        double mediaPontuacao = relatorios.stream()
                .mapToDouble(r -> r.getPontuacao() != null ? r.getPontuacao() : 0.0)
                .average().orElse(0);

        double percentualAcertos = relatorios.stream()
                .mapToDouble(r -> {
                    Integer acertos = r.getAcertos() != null ? r.getAcertos() : 0;
                    Integer erros = r.getErros() != null ? r.getErros() : 0;
                    int total = acertos + erros;
                    return total > 0 ? (double) acertos / total : 0.0;
                })
                .average().orElse(0) * 100;

        double tempoMedio = relatorios.stream()
                .mapToDouble(r -> r.getTempoGasto() != null ? r.getTempoGasto() : 0.0)
                .average().orElse(0);

        long atividadesFinalizadas = relatorios.stream().count();

// Persistência e resiliência - considera apenas atividades com tentativas registradas
        double mediaTentativas = relatorios.stream()
                .filter(r -> r.getTentativas() != null) // Filtra apenas atividades com tentativas registradas
                .mapToDouble(RelatorioAtividade::getTentativas)
                .average()
                .orElse(0);


        double errosTotais = relatorios.stream()
                .mapToDouble(r -> r.getErros() != null ? r.getErros() : 0)
                .sum();

        double resiliência = errosTotais > 0 ? mediaTentativas / errosTotais : 0;

// Consolidando dados para gráficos
        Map<String, List<Double>> dadosGraficos = relatorios.stream()
                .reduce(new HashMap<>(Map.of(
                        "tempoGasto", new ArrayList<Double>(),
                        "tentativas", new ArrayList<Double>(),
                        "pontuacao", new ArrayList<Double>()
                )), (map, r) -> {
                    map.get("tempoGasto").add(r.getTempoGasto() != null ? r.getTempoGasto().doubleValue() : 0.0);
                    map.get("tentativas").add(r.getTentativas() != null ? r.getTentativas().doubleValue() : 0.0);
                    map.get("pontuacao").add(r.getPontuacao() != null ? r.getPontuacao() : 0.0);
                    return map;
                }, (map1, map2) -> {
                    map1.get("tempoGasto").addAll(map2.get("tempoGasto"));
                    map1.get("tentativas").addAll(map2.get("tentativas"));
                    map1.get("pontuacao").addAll(map2.get("pontuacao"));
                    return map1;
                });


        // Estatísticas por tipo de atividade
        Map<String, Map<String, Object>> desempenhoPorTipo = calcularDesempenhoPorTipo(relatorios);

        return Map.of(
                "mediaPontuacao", mediaPontuacao,
                "percentualAcertos", percentualAcertos,
                "tempoMedio", tempoMedio,
                "atividadesFinalizadas", atividadesFinalizadas,
                "mediaTentativas", mediaTentativas,
                "resiliencia", resiliência,
                "dadosGraficos", dadosGraficos,
                "desempenhoPorTipo", desempenhoPorTipo
        );
    }

    private Map<String, Map<String, Object>> calcularDesempenhoPorTipo(List<RelatorioAtividade> relatorios) {
        Map<String, List<RelatorioAtividade>> relatoriosPorTipo = relatorios.stream()
                .collect(Collectors.groupingBy(RelatorioAtividade::getTipoAtividade));

        Map<String, Map<String, Object>> desempenhoPorTipo = new HashMap<>();

        for (Map.Entry<String, List<RelatorioAtividade>> entry : relatoriosPorTipo.entrySet()) {
            String tipoAtividade = entry.getKey();
            List<RelatorioAtividade> atividades = entry.getValue();

            double mediaPontuacao = atividades.stream()
                    .mapToDouble(r -> r.getPontuacao() != null ? r.getPontuacao() : 0.0)
                    .average().orElse(0);

            double percentualAcertos = atividades.stream()
                    .mapToDouble(r -> {
                        Integer acertos = r.getAcertos() != null ? r.getAcertos() : 0;
                        Integer erros = r.getErros() != null ? r.getErros() : 0;
                        int total = acertos + erros;
                        return total > 0 ? (double) acertos / total : 0.0;
                    })
                    .average().orElse(0) * 100;

            double tempoMedio = atividades.stream()
                    .mapToDouble(r -> r.getTempoGasto() != null ? r.getTempoGasto() : 0.0)
                    .average().orElse(0);

            desempenhoPorTipo.put(tipoAtividade, Map.of(
                    "mediaPontuacao", mediaPontuacao,
                    "percentualAcertos", percentualAcertos,
                    "tempoMedio", tempoMedio
            ));
        }

        return desempenhoPorTipo;
    }
}
