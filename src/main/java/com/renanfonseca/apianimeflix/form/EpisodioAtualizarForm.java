package com.renanfonseca.apianimeflix.form;

import com.renanfonseca.apianimeflix.model.Episodio;
import com.renanfonseca.apianimeflix.repository.EpisodioRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EpisodioAtualizarForm {

    private String nome;

    private Integer numeroEpisodio;

    private String sinopse;

    private String url;

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

    public Episodio atualizar(Long id, EpisodioRepository episodioRepository) {
        Episodio episodio = episodioRepository.getReferenceById(id);

        if (this.nome != null) {
            episodio.setNome(this.nome);
        }

        if (this.numeroEpisodio != null) {
            episodio.setNumeroEpisodio(this.numeroEpisodio);
        }

        if (this.sinopse != null) {
            episodio.setSinopse(this.sinopse);
        }

        if (this.url != null) {
            episodio.setUrl(this.url);
        }

        return episodio;
    }
}
