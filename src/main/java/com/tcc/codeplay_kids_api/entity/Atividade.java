package com.tcc.codeplay_kids_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String dataCriacao;
    private String prazo;
    @ManyToOne
    private Turma turma;
}
