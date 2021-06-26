package com.scatena.marcello.RaidManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scatena.marcello.RaidManager.client.RaidListClient;
import com.scatena.marcello.RaidManager.client.UserClient;
import com.scatena.marcello.RaidManager.dto.RaidInfoDTO;

@Service
public class RaidManagerService {

	@Autowired
	private RaidListClient raidListClient;
	
	public void createRaid(RaidInfoDTO raidInfo, String userFriendCode) {

		//userClient.getUserFriendCode(userFriendCode);
		//raidListClient.createRaid(raidInfo.getPokeId());
		
	}
	
	public List<RaidInfoDTO> getAllRaids() {
		return raidListClient.getAllRaids();
		
	}

	
}
