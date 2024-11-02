package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.*;
import com.tcc.codeplay_kids_api.repository.AlunoRepository;
import com.tcc.codeplay_kids_api.repository.AtividadeRepository;
import com.tcc.codeplay_kids_api.repository.RelatorioAtividadeRepository;
import com.tcc.codeplay_kids_api.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<Atividade> getPendingByAluno(Aluno aluno){

        List<Atividade> atividadesPendentes = new ArrayList<>();

        //atividades lançadas para a turma do aluno
        Optional<List<Atividade>> atividadesDaTurma = atividadeRepository.getByTurmaId(aluno.getTurma().getId());

        List<RelatorioAtividade> relatoriosAluno = new ArrayList<>();

        //buscar relatorios relacionados a esse aluno, em cada atividade
        atividadesDaTurma.ifPresent(atividades -> atividades.forEach(atividade -> {
            Optional<List<RelatorioAtividade>> relatorioAlunoAtividade = relatorioAtividadeRepository.getByAtividadeIdAndAlunoId(atividade.getId(), aluno.getId());

            //se não existir relatório, significa que a atividade está pendente para o aluno
            if(relatorioAlunoAtividade.get().isEmpty()){
                atividadesPendentes.add(atividade);
            }
        }));

        return atividadesPendentes;
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
