package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.Professor;
import com.tcc.codeplay_kids_api.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public Professor save (Professor professor) { return professorRepository.save(professor);}

    public Boolean validateLogin(String email, String senha){

        Optional<Professor> professorEncontrado = professorRepository.getByEmail(email);

        if(professorEncontrado.isPresent()){
            if(professorEncontrado.get().getSenha().equalsIgnoreCase(senha)){
                return true;
            }
        }
        return false;
    }
}
