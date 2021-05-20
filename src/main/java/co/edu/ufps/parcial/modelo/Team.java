package co.edu.ufps.parcial.modelo;

import java.io.Serializable;

public class Team implements Serializable {

	private String id;
	private String name;
	private Country country;
	public Team(String id, String name, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	public Team(String id) {
		super();
		this.id = id;
	}
	
	
	public Team() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
