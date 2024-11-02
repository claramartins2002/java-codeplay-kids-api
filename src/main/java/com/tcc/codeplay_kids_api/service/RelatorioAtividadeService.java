package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.Aluno;
import com.tcc.codeplay_kids_api.entity.RelatorioAtividade;
import com.tcc.codeplay_kids_api.repository.AlunoRepository;
import com.tcc.codeplay_kids_api.repository.RelatorioAtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RelatorioAtividadeService {

    @Autowired
    RelatorioAtividadeRepository relatorioAtividadeRepository;

    @Autowired
    AlunoRepository alunoRepository;

    public RelatorioAtividade save(RelatorioAtividade relatorioAtividade){
        return relatorioAtividadeRepository.save(relatorioAtividade);
    }

    public List<RelatorioAtividade> getByTurma(Long turmaId){

        //alunos da turma
        Optional<List<Aluno>> alunosDaTurma = alunoRepository.getByTurmaId(turmaId);

        // lista de todos os relatorios da turma
        List<RelatorioAtividade> relatorios = new ArrayList<>();

        alunosDaTurma.ifPresent(alunos ->
                alunos.forEach(aluno -> {
                    Optional<List<RelatorioAtividade>> relatoriosPorAluno = relatorioAtividadeRepository.getByAlunoId(aluno.getId());

                    //add relatorios do aluno para lista macro
                    relatoriosPorAluno.ifPresent(relatorios::addAll);

                }));

        return relatorios;
    }

    public Optional<List<RelatorioAtividade>> getByAtividade(Long atividadeId){
        return relatorioAtividadeRepository.getByAtividadeId(atividadeId);
    }

    public Optional<List<RelatorioAtividade>> getByAluno(Long alunoId){
        return relatorioAtividadeRepository.getByAlunoId(alunoId);
    }

    public Optional<List<RelatorioAtividade>> getByAlunoAndAtividade(Long alunoId, Long atividadeId){
        return relatorioAtividadeRepository.getByAtividadeIdAndAlunoId(atividadeId, alunoId);
    }
}
