package com.renanfonseca.apianimeflix.form;

import com.renanfonseca.apianimeflix.model.Episodio;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EpisodioForm {

    @NotNull
    @NotEmpty
    private String nome;

    @NotNull
    private int numeroEpisodio;

    @NotNull
    @NotEmpty
    private String sinopse;

    @NotNull
    @NotEmpty
    private String url;

    public Episodio converter() {
        return new Episodio(nome, numeroEpisodio, sinopse, url);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
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
