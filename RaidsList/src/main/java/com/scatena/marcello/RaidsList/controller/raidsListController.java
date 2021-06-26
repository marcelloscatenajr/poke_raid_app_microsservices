package com.scatena.marcello.RaidsList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scatena.marcello.RaidsList.model.Raid;
import com.scatena.marcello.RaidsList.repository.RaidRepository;



@RestController
@RequestMapping("/raidsList")
public class raidsListController {
	
	@Autowired
	RaidRepository raidRepository;
	
	@GetMapping
	public List<Raid> getAllRaids() {
		List<Raid> raidsList = raidRepository.findAll();
		return raidsList;
	}
	
	@PostMapping
	public void createRaid(@RequestBody Raid raid) {
		raidRepository.save(raid);
	}
	

}
