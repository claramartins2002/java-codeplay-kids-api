package com.tcc.codeplay_kids_api.service;

import com.tcc.codeplay_kids_api.entity.Jogo;
import com.tcc.codeplay_kids_api.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogoService {

    @Autowired
    JogoRepository jogoRepository;

    public Jogo save(Jogo jogo){
        return jogoRepository.save(jogo);
    }

    public Optional<Jogo> getById(Long id) {
        return jogoRepository.findById(id);
    }

    public List<Jogo> getAll() {
        return jogoRepository.findAll();
    }

    public Boolean delete(Long idJogo){
        try {
            jogoRepository.deleteById(idJogo);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
