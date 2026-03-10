package com.ronaldo.forumhub.controller;

import com.ronaldo.forumhub.model.Topico;
import com.ronaldo.forumhub.repository.TopicoRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @GetMapping
    public List<Topico> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Topico buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Topico criar(@RequestBody Topico topico) {
        return repository.save(topico);
    }

    @PutMapping("/{id}")
    public Topico atualizar(@PathVariable Long id, @RequestBody Topico dados) {

        Topico topico = repository.findById(id).orElseThrow();

        topico.setTitulo(dados.getTitulo());
        topico.setMensagem(dados.getMensagem());
        topico.setCurso(dados.getCurso());

        return repository.save(topico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
