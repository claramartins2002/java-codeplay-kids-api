package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.entity.Aluno;
import com.tcc.codeplay_kids_api.entity.Atividade;
import com.tcc.codeplay_kids_api.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/atividade")
public class AtividadeController {

    @Autowired
    AtividadeService atividadeService;


    @PostMapping
    public Atividade save(@RequestBody Atividade atividade){
        return atividadeService.save(atividade);
    }

    @PutMapping
    public Atividade edit(@RequestBody Atividade atividade){
        return atividadeService.save(atividade);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Long id){
        return atividadeService.delete(id);
    }

    @GetMapping("/getByProfessor/{professorId}")
    public List<Atividade> getByProfessor(@PathVariable Long professorId) {
        return atividadeService.getByProfessorId(professorId);
    }

    @GetMapping("/getByTurma/{turmaId}")
    public Optional<List<Atividade>> getByTurma(@PathVariable Long turmaId){
    return atividadeService.getByTurma(turmaId);
}
    @GetMapping("/getPendingByAluno")
    public List<Atividade> pendingByAluno(@RequestBody Aluno aluno){
        return atividadeService.getPendingByAluno(aluno);
    }
}
