package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.*;
import com.tcc.codeplay_kids_api.repository.AlunoRepository;
import com.tcc.codeplay_kids_api.repository.AtividadeRepository;
import com.tcc.codeplay_kids_api.repository.RelatorioAtividadeRepository;
import com.tcc.codeplay_kids_api.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AtividadeService {

    @Autowired
    AtividadeRepository atividadeRepository;

    @Autowired
    TurmaRepository turmaRepository;

    @Autowired
    RelatorioAtividadeRepository relatorioAtividadeRepository;

    @Autowired
    AlunoRepository alunoRepository;

    public Atividade save(Atividade atividade){
        return atividadeRepository.save(atividade);
    }

    public Optional<List<Atividade>> getByTurma(Long turmaId){
        return atividadeRepository.getByTurmaId(turmaId);
    }

    public List<Atividade> getByProfessorId(Long professorId){

        //turmas do professor
        Optional<List<Turma>> turmasPorProfessor = turmaRepository.getByProfessorId(professorId);

        //lista de atividades de todas as turmas
        List<Atividade> atividades = new ArrayList<>();

        turmasPorProfessor.ifPresent(turmas ->
                turmas.forEach(turma -> {

                    Optional<List<Atividade>> atividadesPorTurma = getByTurma(turma.getId());

                    //add as atividades da turma para lista macro
                    atividadesPorTurma.ifPresent(atividades::addAll);
                }));

        return atividades;

    }

    public List<Jogo> getPendingJogosByAlunoId(Long alunoId) {

        // Lista para armazenar os jogos das atividades pendentes
        List<Jogo> jogosPendentes = new ArrayList<>();

        // Buscar o aluno pelo ID
        Aluno aluno = alunoRepository.findById(alunoId)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        // Buscar atividades da turma do aluno
        Optional<List<Atividade>> atividadesDaTurma = atividadeRepository.getByTurmaId(aluno.getTurma().getId());

        // Verificar as atividades pendentes para o aluno
        atividadesDaTurma.ifPresent(atividades -> atividades.forEach(atividade -> {

// Define o formato da data de encerramento
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

// Converte a data de encerramento da atividade para LocalDate
            LocalDate dataEncerramento = LocalDate.parse(atividade.getDataEncerramento(), formatter);

// Obtém a data atual
            LocalDate dataAtual = LocalDate.now();

// Se a data de encerramento for maior ou igual à data atual, o jogo será exibido
            if (!dataEncerramento.isBefore(dataAtual)) {
                Jogo jogo = atividade.getJogo();
                jogo.setId(atividade.getId());
                if (!jogosPendentes.contains(jogo)) {
                    jogosPendentes.add(jogo);
                }
            }
        }));

        return jogosPendentes;
    }


    public Boolean delete(Long idAtividade){
        try {
            atividadeRepository.deleteById(idAtividade);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }}
