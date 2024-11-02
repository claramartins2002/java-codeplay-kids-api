package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.Aluno;
import com.tcc.codeplay_kids_api.entity.Professor;
import com.tcc.codeplay_kids_api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;


    public Aluno save(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Optional<List<Aluno>> getByTurma(Long idTurma){
        return alunoRepository.getByTurmaId(idTurma);
    }

    public Boolean delete(Long idAluno){
        try {
            alunoRepository.deleteById(idAluno);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public Boolean validateLogin(String user, String senha){

        Optional<Aluno> alunoEncontrado = alunoRepository.getByUsuarioAndSenha(user, senha);

        return alunoEncontrado.isPresent();
    }
}
