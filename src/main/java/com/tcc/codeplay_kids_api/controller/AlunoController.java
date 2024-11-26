package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.dto.LoginDto;
import com.tcc.codeplay_kids_api.entity.Aluno;
import com.tcc.codeplay_kids_api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    AlunoService alunoService;

    @PostMapping
    public Aluno save(@RequestBody Aluno aluno){
        return alunoService.save(aluno);
    }

    @GetMapping("/getByTurma/{turmaId}")
    public Optional<List<Aluno>> getByTurma(@PathVariable Long turmaId){
        return alunoService.getByTurma(turmaId);
    }

    @PutMapping
    public Aluno editar(Aluno aluno){
        return alunoService.save(aluno);
    }

    @DeleteMapping("{alunoId}")
    public Boolean delete(@PathVariable Long alunoId){
        return alunoService.delete(alunoId);
    }

    @PostMapping("/login")
    public ResponseEntity<Optional<Aluno>> login(@RequestBody LoginDto loginDto){
        System.out.println(loginDto);
        Optional<Aluno> response = alunoService.validateLogin(loginDto.getEmail(), loginDto.getSenha());
        return ResponseEntity.status(response.isPresent() ? 200 : 400).body(response);
    }
}
