package com.ronaldo.forumhub.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensagem;

    private String curso;

    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Topico() {}

    public Topico(String titulo, String mensagem, String curso) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getCurso() {
        return curso;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}