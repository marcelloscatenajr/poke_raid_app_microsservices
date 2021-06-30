package com.scatena.marcello.Raid.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scatena.marcello.Raid.dto.PokemonDTO;
import com.scatena.marcello.Raid.dto.RaidDTO;
import com.scatena.marcello.Raid.model.Raid;
import com.scatena.marcello.Raid.repository.RaidRepository;
import com.scatena.marcello.Raid.service.RaidService;


@RestController
@RequestMapping("/raid")
public class raidController {

	@Autowired
	RaidRepository raidRepository;
	
	@Autowired
	RaidService raidService;
	
	@CrossOrigin
	@GetMapping
	public List<RaidDTO> getAllRaids() {
		List<Raid> raidsList = raidRepository.findAll();
		List<RaidDTO> raidDTOList = new ArrayList();
		raidsList.forEach(raid -> {
			PokemonDTO pokemon = raidService.getPokemon(raid.getPokemonNumber());
			RaidDTO raidDTO = new RaidDTO(raid.getId(), raid.getHostFC(), raid.getGuestFC1(),raid.getGuestFC2(),raid.getGuestFC3(), pokemon);
			raidDTOList.add(raidDTO);
			});
		return raidDTOList;
	}
	
	@CrossOrigin
	@GetMapping("/{id}")
	public RaidDTO findRaid(@PathVariable Long id) {
		Optional<Raid> optRaid = raidRepository.findById(id);
		Raid raid = optRaid.get();
		PokemonDTO pokemon = raidService.getPokemon(raid.getPokemonNumber());
		RaidDTO raidDTO =  new RaidDTO(raid.getId(), raid.getHostFC(), raid.getGuestFC1(),raid.getGuestFC2(),raid.getGuestFC3(), pokemon);
		return raidDTO;
		
		
	}
	
	@CrossOrigin
	@PostMapping
	public Long createRaid(@RequestBody Raid raid) {
		raidRepository.save(raid);
		raidRepository.flush();
		return raid.getId();
		
	}
	
	@CrossOrigin
	@PutMapping("/join/{id}/{guestFC}")
	@Transactional
	public ResponseEntity<Raid> joinRaid(@PathVariable Long id, @PathVariable Long guestFC) {
		Optional<Raid> optRaid = raidRepository.findById(id);
		Raid raid = optRaid.get();
		if(raid.getGuestFC1()==null) {
			raid.setGuestFC1(guestFC);
			return ResponseEntity.ok(raid);
		}
			
		else if(raid.getGuestFC2()==null) {
			raid.setGuestFC2(guestFC);
			return ResponseEntity.ok(raid);
		}
			
		else if(raid.getGuestFC3()==null) {
			raid.setGuestFC3(guestFC);
			return ResponseEntity.ok(raid);
		}
		else {
			return ResponseEntity.badRequest().build();
		}	
		
	}
	
	@CrossOrigin
	@PutMapping("/quit/{id}/{guestFC}")
	@Transactional
	public ResponseEntity<Raid> quitRaid(@PathVariable Long id, @PathVariable Long guestFC) {
		Optional<Raid> optRaid = raidRepository.findById(id);
		Raid raid = optRaid.get();
		if(raid.getGuestFC1()==guestFC) {
			raid.setGuestFC1(null);
			return ResponseEntity.ok(raid);
		}
			
		else if(raid.getGuestFC2()==guestFC) {
			raid.setGuestFC2(null);
			return ResponseEntity.ok(raid);
		}
			
		else if(raid.getGuestFC3()==guestFC) {
			raid.setGuestFC3((long) 344);
			return ResponseEntity.ok(raid);
		}
		else {
			return ResponseEntity.badRequest().build();
		}	
		
	}
	
	@CrossOrigin
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<Raid> deleteRaid(@PathVariable Long id) {
		Optional<Raid> optional = raidRepository.findById(id);
		if (optional.isPresent()) {
			raidRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
		
		
	}
}
