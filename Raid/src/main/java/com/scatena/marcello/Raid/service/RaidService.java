package com.scatena.marcello.Raid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scatena.marcello.Raid.client.PokemonClient;
import com.scatena.marcello.Raid.dto.PokemonDTO;

@Service
public class RaidService {

	@Autowired
	private PokemonClient pokemonClient;
	
	public PokemonDTO getPokemon(Integer pokemonNumber){
		return pokemonClient.getPokemonByNumber(pokemonNumber);
	}
}
