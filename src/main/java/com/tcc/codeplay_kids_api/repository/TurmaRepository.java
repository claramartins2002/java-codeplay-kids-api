package com.tcc.codeplay_kids_api.repository;

import com.tcc.codeplay_kids_api.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
    Optional<List<Turma>> getByProfessorId(Long professorId);
    Turma getById(Long id);
}
