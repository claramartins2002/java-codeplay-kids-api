package com.tcc.codeplay_kids_api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Duration;

@Entity
@Data
@Table(name = "tb_relatorio_atividade", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"aluno_id", "atividade_id"})
})
public class RelatorioAtividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer tempoGasto;
    private Double pontuacao;
    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Atividade atividade;
    private Integer tentativas;
    private Integer acertos;
    private Integer erros;
    private String tipoAtividade; // Ex: "Matemática", "Quebra-Cabeça"
    private String feedback;

}
