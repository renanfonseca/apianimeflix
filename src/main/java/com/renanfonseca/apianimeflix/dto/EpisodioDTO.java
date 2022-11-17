package com.renanfonseca.apianimeflix.dto;

import com.renanfonseca.apianimeflix.model.Episodio;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EpisodioDTO {

    private Long id;
    private String nome;
    private Integer numeroEpisodio;
    private String sinopse;
    private String url;

    public EpisodioDTO() {
    }

    public EpisodioDTO (Episodio episodio) {
        this.id = episodio.getId();
        this.nome = episodio.getNome();
        this.numeroEpisodio = episodio.getNumeroEpisodio();
        this.sinopse = episodio.getSinopse();
        this.url = episodio.getUrl();
    }



    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getUrl() {
        return url;
    }

    public static List<EpisodioDTO> toDTO(List<Episodio> episodioList) {
        return episodioList.stream()
                .map(e -> {
                    return new EpisodioDTO(e);
                }).collect(Collectors.toList());
    }

    public static List<EpisodioDTO> toDTO(Optional<Episodio> episodio) {
        return episodio.stream()
                .map(e -> {
                    return new EpisodioDTO(e);
                }).collect(Collectors.toList());
    }


}
