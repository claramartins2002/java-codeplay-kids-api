package com.tcc.codeplay_kids_api.repository;

import com.tcc.codeplay_kids_api.entity.RelatorioAtividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RelatorioAtividadeRepository extends JpaRepository<RelatorioAtividade, Long> {
    List<RelatorioAtividade> findByAlunoId(Long alunoId);
Optional<List<RelatorioAtividade>> getByAtividadeId(Long atividadeId);
Optional<List<RelatorioAtividade>> getByAlunoId(Long alunoId);
    @Query("SELECT r FROM RelatorioAtividade r WHERE r.aluno.id = :alunoId AND r.atividade.id = :atividadeId")
    Optional<RelatorioAtividade> getByAtividadeIdAndAlunoId(@Param("alunoId") Long alunoId, @Param("atividadeId") Long atividadeId);
    List<RelatorioAtividade> findByNotificadoFalse();
    @Query("SELECT r FROM RelatorioAtividade r WHERE r.aluno.turma.professor.id = :professorId AND r.notificado = false")
    List<RelatorioAtividade> findByProfessorIdAndNotificadoFalse(@Param("professorId") Long professorId);

}
