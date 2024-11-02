package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.entity.Turma;
import com.tcc.codeplay_kids_api.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    TurmaService turmaService;


    @GetMapping("/getByProfessorId/{profId}")
    public Optional<List<Turma>> getByProfessorId(@PathVariable Long profId){
        return turmaService.getByProfessor(profId);
    }

    @PostMapping
    public Turma save(@RequestBody Turma turma){
        return turmaService.save(turma);
    }

    @PutMapping
    public Turma edit(@RequestBody Turma turma){
        return turmaService.save(turma);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Long id){
        return turmaService.delete(id);
    }
}
