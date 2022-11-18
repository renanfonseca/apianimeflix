package com.renanfonseca.apianimeflix.repository;

import com.renanfonseca.apianimeflix.model.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodioRepository extends JpaRepository<Episodio, Long> {
}
