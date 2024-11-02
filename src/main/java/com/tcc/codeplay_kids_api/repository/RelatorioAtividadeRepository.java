package com.tcc.codeplay_kids_api.repository;

import com.tcc.codeplay_kids_api.entity.RelatorioAtividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RelatorioAtividadeRepository extends JpaRepository<RelatorioAtividade, Long> {
Optional<List<RelatorioAtividade>> getByAtividadeId(Long atividadeId);
Optional<List<RelatorioAtividade>> getByAlunoId(Long alunoId);
Optional<List<RelatorioAtividade>> getByAtividadeIdAndAlunoId(Long atividadeId, Long alunoId);

}
