package com.renanfonseca.apianimeflix.controller;

import com.renanfonseca.apianimeflix.dto.EpisodioDTO;
import com.renanfonseca.apianimeflix.model.Episodio;
import com.renanfonseca.apianimeflix.repository.EpisodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Episodios")
public class EpisodiosController {

    @Autowired
    private EpisodioRepository episodioRepository;

    @GetMapping
    public List<EpisodioDTO> allEpisodios() {
        List<Episodio> episodioList = episodioRepository.findAll();
        return EpisodioDTO.toDTO(episodioList);
    }

    @GetMapping("/{id}")
    public List<EpisodioDTO> episodioByID(@PathVariable("id") Long id) {
        Optional<Episodio> episodio = episodioRepository.findById(id);
        if(episodio.isPresent()){
            return EpisodioDTO.toDTO(episodio);
        }
        return null;
    }
}
