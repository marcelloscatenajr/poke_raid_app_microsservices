package com.scatena.marcello.Raid.dto;

public class PokemonDTO {
	private Integer number;
	private String name;
	private String image;
	private String type1;
	private String type2;
	
	public PokemonDTO() {
		
	}
	public PokemonDTO(int number, String name, String image, String type1, String type2) {
		this.number = number;
		this.name = name;
		this.image = image;
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
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
}
