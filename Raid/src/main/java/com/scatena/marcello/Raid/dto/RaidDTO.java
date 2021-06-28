package com.scatena.marcello.Raid.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.scatena.marcello.Raid.model.Raid;

public class RaidDTO {

	private Long id;
	
	public PokemonDTO pokemon;
	public Long hostFC;
	public Long guestFC1;
	public Long guestFC2;
	public Long guestFC3;

	public RaidDTO(Long id, Long hostFC, Long guestFC1, Long guestFC2,Long guestFC3, PokemonDTO pokemon) {
		this.id = id;
		this.hostFC = hostFC;
		this.guestFC1 = guestFC1;
		this.guestFC2 = guestFC2;
		this.guestFC3 = guestFC3;
		this.pokemon = pokemon;
		
	}
	public RaidDTO(Long id, Long hostFC, PokemonDTO pokemon) {
		this.id = id;
		this.hostFC = hostFC;
		this.pokemon = pokemon;
	};
	public PokemonDTO getPokemon() {
		return pokemon;
	}
	public void setPokemon(PokemonDTO pokemon) {
		this.pokemon = pokemon;
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public RaidDTO() {
	}
	
}
