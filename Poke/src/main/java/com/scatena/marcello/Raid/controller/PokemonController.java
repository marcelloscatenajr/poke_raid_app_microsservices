package com.scatena.marcello.Raid.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scatena.marcello.Raid.model.Pokemon;
import com.scatena.marcello.Raid.repository.PokemonRepository;


@RestController
@RequestMapping("/raid")
public class PokemonController {

	@Autowired
	PokemonRepository pokemonRepository;

	
}
