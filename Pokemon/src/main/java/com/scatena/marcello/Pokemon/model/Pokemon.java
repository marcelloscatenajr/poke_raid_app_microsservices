package com.scatena.marcello.Pokemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	private Integer number;
	private String name;
	private String image;
	private String type1;
	private String type2;
	
	public Pokemon() {
		
	}
	public Pokemon(int number, String name, String type1, String type2) {
		this.number = number;
		this.name = name;
		this.image = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/%22+ widget.cardInfo["+number+"].png";
		this.type1 = type1;
		this.type2 = type2;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String gettype1() {
		return type1;
	}
	public void settype1(String type1) {
		this.type1 = type1;
	}
	public String gettype2() {
		return type2;
	}
	public void settype2(String type2) {
		this.type2 = type2;
	}
}
