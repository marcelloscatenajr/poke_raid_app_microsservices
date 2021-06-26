package com.scatena.marcello.RaidManager.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scatena.marcello.RaidManager.dto.RaidInfoDTO;


@FeignClient("raid")
public interface RaidListClient {

	@GetMapping("/raid")
	public List<RaidInfoDTO> getAllRaids();

}
