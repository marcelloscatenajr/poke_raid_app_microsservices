package com.scatena.marcello.Pokemon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scatena.marcello.Pokemon.model.Pokemon;
import com.scatena.marcello.Pokemon.repository.PokemonRepository;



@RestController
@RequestMapping("/pokemon")
public class pokemonController {
	
	@Autowired
	PokemonRepository pokemonRepository;

	@CrossOrigin
	@GetMapping
	public List<Pokemon> getAllPokemon() {
		List<Pokemon> pokemonList = pokemonRepository.findAll();
		return pokemonList;
	}
	
	@CrossOrigin
	@GetMapping("/{number}")
	public Pokemon getPokemonByNumber(@PathVariable Integer number) {
		Pokemon pokemon = pokemonRepository.findByNumber(number);
		return pokemon;
	}
	
	@CrossOrigin
	@PostMapping
	public void createRaid(@RequestBody Pokemon pokemon) {
		pokemonRepository.save(pokemon);
	}
}
