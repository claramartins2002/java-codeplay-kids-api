package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.entity.RelatorioAtividade;
import com.tcc.codeplay_kids_api.service.RelatorioAtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/relatorio")
public class RelatorioAtividadeController {

    @Autowired
    RelatorioAtividadeService relatorioAtividadeService;

    @PostMapping
    public RelatorioAtividade save(@RequestBody RelatorioAtividade relatorioAtividade){
        return relatorioAtividadeService.save(relatorioAtividade);
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
