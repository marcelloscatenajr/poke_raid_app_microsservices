package com.scatena.marcello.Raid.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.scatena.marcello.Raid.dto.PokemonDTO;

@FeignClient("pokemon")
public interface PokemonClient {

	@GetMapping("/pokemon/{number}")
	public PokemonDTO getPokemonByNumber(@PathVariable Integer number);
}
