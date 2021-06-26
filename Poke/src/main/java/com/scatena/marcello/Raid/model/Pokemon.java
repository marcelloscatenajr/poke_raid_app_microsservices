package com.scatena.marcello.Raid.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	String pokemon;
	public Long hostFC;
	public Long guestFC;
	
	public Pokemon(String pokemon, String host) {
		this.pokemon = pokemon;
	}
	public Pokemon() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPokemon() {
		return pokemon;
	}
	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}
	public Long getHostFC() {
		return hostFC;
	}
	public void setHostFC(Long hostFC) {
		this.hostFC = hostFC;
	}
	public Long getGuestFC() {
		return guestFC;
	}
	public void setGuestFC(Long guestFC) {
		this.guestFC = guestFC;
	}
	
	/*public ArrayList<Long> getUsersId() {
		return hostFC;
	}*/
	/*public void setUsersId(ArrayList<Long> usersId) {
		UsersId = usersId;
	}*/
}
