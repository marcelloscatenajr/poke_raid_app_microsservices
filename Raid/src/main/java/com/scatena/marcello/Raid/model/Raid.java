package com.scatena.marcello.Raid.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Raid {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer pokemonNumber;
	public Long hostFC;
	public Long guestFC1;
	public Long guestFC2;
	public Long guestFC3;
	
	public Raid(Integer pokemonNumber, Long hostFC) {
		this.pokemonNumber = pokemonNumber;
		this.hostFC = hostFC;
	}
	public Raid() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(Integer pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	public Long getHostFC() {
		return hostFC;
	}
	public void setHostFC(Long hostFC) {
		this.hostFC = hostFC;
	}

	public Long getGuestFC1() {
		return guestFC1;
	}
	public void setGuestFC1(Long guestFC1) {
		this.guestFC1 = guestFC1;
	}
	public Long getGuestFC2() {
		return guestFC2;
	}
	public void setGuestFC2(Long guestFC2) {
		this.guestFC2 = guestFC2;
	}
	public Long getGuestFC3() {
		return guestFC3;
	}
	public void setGuestFC3(Long guestFC3) {
		this.guestFC3 = guestFC3;
	}
	
	
	/*public ArrayList<Long> getUsersId() {
		return hostFC;
	}*/
	/*public void setUsersId(ArrayList<Long> usersId) {
		UsersId = usersId;
	}*/
}
