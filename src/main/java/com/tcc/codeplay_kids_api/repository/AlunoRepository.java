package com.tcc.codeplay_kids_api.repository;

import com.tcc.codeplay_kids_api.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Optional<List<Aluno>> getByTurmaId(Long turmaId);
    Optional<Aluno> getByUsuarioAndSenha(String user, String senha);
}
