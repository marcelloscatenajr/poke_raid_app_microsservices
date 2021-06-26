package com.scatena.marcello.RaidsList.model;


import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Raid {

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String pokemon;
	ArrayList<Long> UsersId;
	
	public Raid(String pokemon, String host) {
		this.pokemon = pokemon;
	}
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
