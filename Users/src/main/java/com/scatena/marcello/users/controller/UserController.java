package com.scatena.marcello.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scatena.marcello.users.model.User;
import com.scatena.marcello.users.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	/*@GetMapping
	public List<User> lista() {
		List<User> users = userRepository.findAll();
		return users;
	}*/
	
	@GetMapping("/{userFriendCode}")
	String getUserFriendCode(@PathVariable String userFriendCode) {
		return null;
	}
}
