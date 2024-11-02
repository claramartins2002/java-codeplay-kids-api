package com.tcc.codeplay_kids_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_progresso_atividade")
public class RelatorioAtividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tempoGasto;
    private Double pontuacao;
    private String status;
    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Atividade atividade;

}
