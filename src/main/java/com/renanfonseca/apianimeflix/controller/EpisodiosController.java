package com.renanfonseca.apianimeflix.controller;

import com.renanfonseca.apianimeflix.model.Episodio;
import com.renanfonseca.apianimeflix.repository.EpisodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Episodios")
public class EpisodiosController {

    @Autowired
    private EpisodioRepository episodioRepository;

    @GetMapping
    public List<Episodio> allEpisodios() {
        List<Episodio> episodioList = episodioRepository.findAll();
        return episodioList;
    }
}
