package com.scatena.marcello.RaidManager.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user")
public interface UserClient {

	@RequestMapping("/{userFriendCode}")
	String getUserFriendCode(@PathVariable String userFriendCode);

	
}
