package com.scatena.marcello.Pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scatena.marcello.Pokemon.model.Pokemon;


public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{
	
	Pokemon findByNumber(Integer number);
}

