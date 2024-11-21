package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.dto.LoginDto;
import com.tcc.codeplay_kids_api.entity.Professor;
import com.tcc.codeplay_kids_api.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
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

    @GetMapping
    public Boolean validateLogin(@RequestBody LoginDto loginDto){
        return professorService.validateLogin(loginDto.getEmail(), loginDto.getSenha());
    }

}
