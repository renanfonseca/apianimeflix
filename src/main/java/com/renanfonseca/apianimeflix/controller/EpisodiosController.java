package com.renanfonseca.apianimeflix.controller;

import com.renanfonseca.apianimeflix.dto.EpisodioDTO;
import com.renanfonseca.apianimeflix.form.EpisodioAtualizarForm;
import com.renanfonseca.apianimeflix.form.EpisodioForm;
import com.renanfonseca.apianimeflix.model.Episodio;
import com.renanfonseca.apianimeflix.repository.EpisodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/episodios")
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

    @Transactional
    @PostMapping
    public ResponseEntity<EpisodioDTO> cadastrarEpisodio(@RequestBody @Valid EpisodioForm episodioForm, UriComponentsBuilder uriComponentsBuilder) {
        Episodio episodio = episodioForm.converter();
        episodioRepository.save(episodio);
        URI uri = uriComponentsBuilder.path("/episodios/{id}").buildAndExpand(episodio.getId()).toUri();
        return ResponseEntity.created(uri).body(new EpisodioDTO(episodio));
    }

    @Transactional
    @PutMapping("/{id}")
    public ResponseEntity<EpisodioDTO> atualizarEpisodio(@PathVariable("id") Long id, @RequestBody @Valid EpisodioAtualizarForm episodioAtualizarForm) {
        Episodio episodio = episodioAtualizarForm.atualizar(id, episodioRepository);

        return ResponseEntity.ok(new EpisodioDTO(episodio));
    }
}
