package com.tcc.codeplay_kids_api.controller;

import com.tcc.codeplay_kids_api.entity.Jogo;
import com.tcc.codeplay_kids_api.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/jogo")
public class JogoController {

    @Autowired
    JogoService jogoService;

    @GetMapping
    public List<Jogo> getAll(){
        return jogoService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Jogo> getById(@PathVariable Long id){
        return jogoService.getById(id);
    }


    @PostMapping
    public Jogo save(@RequestBody Jogo jogo){
        return jogoService.save(jogo);
    }

    @PutMapping
    public Jogo edit(@RequestBody Jogo jogo){
        return jogoService.save(jogo);
    }
}
