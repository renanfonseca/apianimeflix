package com.renanfonseca.apianimeflix.model;

import javax.persistence.*;

@Entity
public class Episodio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer numeroEpisodio;
    private String sinopse;
    private String url;

    public  Episodio() {

    }

    public Episodio(String nome, int numeroEpisodio, String sinopse, String url) {
        super();
        this.nome = nome;
        this.numeroEpisodio = numeroEpisodio;
        this.sinopse = sinopse;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
