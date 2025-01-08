package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.RelatorioAtividade;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    public String gerarFeedback(RelatorioAtividade relatorio) {
        String tipoAtividade = relatorio.getTipoAtividade();
        switch (tipoAtividade) {
            case "Quebra-Cabeça", "Caça Palavras", "Arraste e Solte":
                return avaliarQuebraCabeca(relatorio);
            case "Jogo da Memória":
                return avaliarJogoMemoria(relatorio);
            case "Operações Matemáticas":
                return avaliarOperacoesMatematicas(relatorio);
            case "Palavras Cruzadas":
                return avaliarPalavrasCruzadas(relatorio);
            case "Relógio":
                return avaliarJogoRelogio(relatorio);
            default:
                return "Atividade não reconhecida para feedback.";
        }
    }

    private String avaliarQuebraCabeca(RelatorioAtividade relatorio) {
        if (relatorio.getTempoGasto() < 180) {
            return "Excelente! Você resolveu o jogo rapidamente.";
        } else if (relatorio.getTempoGasto() < 300) {
            return "Bom trabalho! Tente melhorar seu tempo na próxima vez.";
        } else {
            return "Continue praticando! Resolver quebra-cabeças mais rapidamente melhora suas habilidades.";
        }
    }

    private String avaliarJogoRelogio(RelatorioAtividade relatorio) {
        if (relatorio.getPontuacao() >= 7) {
            return "Excelente! Você consegue dizer qualquer horário do dia";
        } else if (relatorio.getPontuacao() >= 4) {
            return "Bom trabalho! Continue olhando as horas para melhorar.";
        } else {
            return "Continue praticando! O relógio as vezes pode ser complicado";
        }
    }

    private String avaliarJogoMemoria(RelatorioAtividade relatorio) {
        if (relatorio.getTentativas() <= 10) {
            return "Fantástico! Sua memória está afiada.";
        } else if (relatorio.getTentativas() <= 15) {
            return "Bom trabalho! Continue praticando para melhorar sua memória.";
        } else {
            return "Não desista! Quanto mais você pratica, melhor sua memória fica.";
        }
    }

    private String avaliarOperacoesMatematicas(RelatorioAtividade relatorio) {
        double percentualAcertos = (double) relatorio.getAcertos() / (relatorio.getAcertos() + relatorio.getErros()) * 100;
        if (percentualAcertos >= 90) {
            return "Ótimo trabalho! Você é um mestre das operações matemáticas.";
        } else if (percentualAcertos >= 70) {
            return "Bom desempenho! Continue praticando para alcançar a perfeição.";
        } else {
            return "Não desanime! Praticar as operações matemáticas ajudará a melhorar.";
        }
    }

    private String avaliarPalavrasCruzadas(RelatorioAtividade relatorio) {
        if (relatorio.getTempoGasto() < 480) {
            return "Excelente vocabulário e agilidade!";
        } else if (relatorio.getTempoGasto() > 500) {
            return "Bom trabalho com as palavras cruzadas!!";
        } else {
            return "Pratique mais para expandir seu vocabulário e melhorar seu desempenho!!";
        }
    }
}
