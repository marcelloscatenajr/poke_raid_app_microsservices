package com.scatena.marcello.Raid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scatena.marcello.Raid.model.Pokemon;



public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{
	Pokemon getOne(Integer number);
}
