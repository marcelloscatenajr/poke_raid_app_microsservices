package com.scatena.marcello.RaidManager.dto;

import java.util.ArrayList;

public class RaidInfoDTO {

	private Long id;
	String pokemon;
	ArrayList<Long> UsersId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPokemon() {
		return pokemon;
	}
	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}
	public ArrayList<Long> getUsersId() {
		return UsersId;
	}
	public void setUsersId(ArrayList<Long> usersId) {
		UsersId = usersId;
	}
}
