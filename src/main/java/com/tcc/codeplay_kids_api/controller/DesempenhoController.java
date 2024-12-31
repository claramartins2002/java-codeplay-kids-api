package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.service.DesempenhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/desempenho")
public class DesempenhoController {

    @Autowired
    private DesempenhoService desempenhoService;

    @GetMapping("/aluno/{alunoId}")
    public Map<String, Object> getDesempenhoPorAluno(@PathVariable Long alunoId) {
        return desempenhoService.getDesempenhoPorAluno(alunoId);
    }

    @GetMapping("/turma/{turmaId}")
    public Map<String, Object> getDesempenhoPorTurma(@PathVariable Long turmaId) {
        return desempenhoService.getDesempenhoPorTurma(turmaId);
    }
}
