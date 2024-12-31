package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.entity.RelatorioAtividade;
import com.tcc.codeplay_kids_api.service.FeedbackService;
import com.tcc.codeplay_kids_api.service.RelatorioAtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/relatorio")
public class RelatorioAtividadeController {

    @Autowired
    RelatorioAtividadeService relatorioAtividadeService;

    @Autowired
    FeedbackService feedbackService;

    @PostMapping
    public String save(@RequestBody RelatorioAtividade relatorio){
        System.out.println(relatorio);

        // Lógica para salvar o relatório no banco de dados (não mostrada aqui)
        String feedback = feedbackService.gerarFeedback(relatorio);
        relatorio.setFeedback(feedback); // Salva o feedback no relatório, se necessário.
        relatorioAtividadeService.salvarOuAtualizarRelatorio(relatorio);
        return feedback;

    }

    @GetMapping("/getByTurma/{turmaId}")
    public List<RelatorioAtividade> getByTurma(@PathVariable Long turmaId){
        return relatorioAtividadeService.getByTurma(turmaId);
    }

    @GetMapping("/getByAtividade/{atividadeId}")
    public Optional<List<RelatorioAtividade>> getByAtividade(@PathVariable Long atividadeId){
        return relatorioAtividadeService.getByAtividade(atividadeId);
    }

    @GetMapping("/getByAluno/{alunoId}")
    public Optional<List<RelatorioAtividade>> getByAluno(@PathVariable Long alunoId){
        return relatorioAtividadeService.getByAluno(alunoId);
    }

}
