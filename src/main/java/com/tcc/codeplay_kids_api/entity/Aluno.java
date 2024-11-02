package com.tcc.codeplay_kids_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String fotoUrl;
    @ManyToOne
    private Turma turma;
    private String usuario;
    private String senha;
}
