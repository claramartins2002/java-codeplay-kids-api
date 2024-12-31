package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.Aluno;
import com.tcc.codeplay_kids_api.entity.RelatorioAtividade;
import com.tcc.codeplay_kids_api.repository.AlunoRepository;
import com.tcc.codeplay_kids_api.repository.RelatorioAtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RelatorioAtividadeService {

    @Autowired
    RelatorioAtividadeRepository relatorioAtividadeRepository;

    @Autowired
    AlunoRepository alunoRepository;

        @Autowired
        private RelatorioAtividadeRepository relatorioRepository;

        public RelatorioAtividade salvarOuAtualizarRelatorio(RelatorioAtividade novoRelatorio) {
            // Busca o relatório existente
            Optional<RelatorioAtividade> relatorioExistente = relatorioRepository
                    .getByAtividadeIdAndAlunoId(novoRelatorio.getAluno().getId(), novoRelatorio.getAtividade().getId());

            if (relatorioExistente.isPresent()) {
                RelatorioAtividade existente = relatorioExistente.get();
                System.out.println("existe!!");

                // Verifica se o novo desempenho é melhor
                if (isDesempenhoMelhor(novoRelatorio, existente)) {
                    System.out.println("maior desempenho encontrado!!");
                    existente.setPontuacao(novoRelatorio.getPontuacao());
                    existente.setTempoGasto(novoRelatorio.getTempoGasto());
                    existente.setAcertos(novoRelatorio.getAcertos());
                    existente.setErros(novoRelatorio.getErros());
                    existente.setTentativas(novoRelatorio.getTentativas());
                    return relatorioRepository.save(existente);
                } else {
                    // Retorna o existente se o novo desempenho não for melhor
                    System.out.println("não faz nada!!");
                    return existente;

                }
            } else {
                // Cria um novo registro se não houver um existente
                return relatorioRepository.save(novoRelatorio);
            }
        }

        private boolean isDesempenhoMelhor(RelatorioAtividade novo, RelatorioAtividade existente) {
            // Exemplo de lógica: considera pontuação e menor tempo como critérios principais
            if(novo.getPontuacao() != null){
            if (novo.getPontuacao() > existente.getPontuacao()) {
                return true;
            }} else if (novo.getTempoGasto().compareTo(existente.getTempoGasto()) < 0) {
                return true;
            }
            return false;
    }


    public List<RelatorioAtividade> getByTurma(Long turmaId){

        //alunos da turma
        Optional<List<Aluno>> alunosDaTurma = alunoRepository.getByTurmaId(turmaId);

        // lista de todos os relatorios da turma
        List<RelatorioAtividade> relatorios = new ArrayList<>();

        alunosDaTurma.ifPresent(alunos ->
                alunos.forEach(aluno -> {
                    Optional<List<RelatorioAtividade>> relatoriosPorAluno = relatorioAtividadeRepository.getByAlunoId(aluno.getId());

                    //add relatorios do aluno para lista macro
                    relatoriosPorAluno.ifPresent(relatorios::addAll);

                }));

        return relatorios;
    }

    public Optional<List<RelatorioAtividade>> getByAtividade(Long atividadeId){
        return relatorioAtividadeRepository.getByAtividadeId(atividadeId);
    }

    public Optional<List<RelatorioAtividade>> getByAluno(Long alunoId){
        return relatorioAtividadeRepository.getByAlunoId(alunoId);
    }

    public Optional<RelatorioAtividade> getByAlunoAndAtividade(Long alunoId, Long atividadeId){
        return relatorioAtividadeRepository.getByAtividadeIdAndAlunoId(atividadeId, alunoId);
    }
}
