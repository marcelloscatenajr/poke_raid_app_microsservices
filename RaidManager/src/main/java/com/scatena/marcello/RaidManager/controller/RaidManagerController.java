package com.scatena.marcello.RaidManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scatena.marcello.RaidManager.client.RaidListClient;
import com.scatena.marcello.RaidManager.dto.RaidInfoDTO;
import com.scatena.marcello.RaidManager.service.RaidManagerService;

@RestController
@RequestMapping("/raid")
public class RaidManagerController {

	@Autowired
	private RaidListClient raidListClient;
	
	@Autowired
	private RaidManagerService raidManagerService;
	
	@PostMapping
	public void createRaid(@RequestBody RaidInfoDTO raidInfo, String userFriendCode) {
		raidManagerService.createRaid(raidInfo, userFriendCode);
	}
	
	@GetMapping
	public List<RaidInfoDTO> getAllRaids(){
		return raidManagerService.getAllRaids();
	}
}
