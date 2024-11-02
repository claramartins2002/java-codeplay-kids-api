package com.tcc.codeplay_kids_api.repository;

import com.tcc.codeplay_kids_api.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
Optional<Professor> getByEmail(String email);
}
