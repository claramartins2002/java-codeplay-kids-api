package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.Turma;
import com.tcc.codeplay_kids_api.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TurmaService {
    @Autowired
    TurmaRepository turmaRepository;

    public Optional<List<Turma>> getByProfessor(Long professorId){
        return turmaRepository.getByProfessorId(professorId);
    }

    public Turma save(Turma turma){
        return turmaRepository.save(turma);
    }

    public Boolean delete(Long idTurma){
        try {
            turmaRepository.deleteById(idTurma);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }}
