package com.tcc.codeplay_kids_api.repository;

import com.tcc.codeplay_kids_api.entity.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    Optional<List<Atividade>> getByTurmaId(Long turmaId);
}
