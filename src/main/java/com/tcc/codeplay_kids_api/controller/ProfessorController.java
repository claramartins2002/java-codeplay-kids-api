package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.dto.LoginDto;
import com.tcc.codeplay_kids_api.entity.Aluno;
import com.tcc.codeplay_kids_api.entity.Professor;
import com.tcc.codeplay_kids_api.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @PostMapping
    public Professor save(@RequestBody Professor professor){
        return professorService.save(professor);
    }

    @GetMapping("/{id}")
    public Optional<Professor> getById(@PathVariable Long id){
        return professorService.getById(id);
    }

    @PostMapping("/login")
    public ResponseEntity<Optional<Professor>> validateLogin(@RequestBody LoginDto loginDto){
        Optional<Professor> response = professorService.validateLogin(loginDto.getEmail(), loginDto.getSenha());
        return ResponseEntity.status(response != null ? 200 : 400).body(response);
    }

}
