package com.lambdaschool.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoo")
public class Zoo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long zooid;

	private String zooname;

	@ManyToMany
	@JoinTable(name = "zooanimals", joinColumns = {@JoinColumn(name = "zooid")},
				inverseJoinColumns = {@JoinColumn(name = "animalid")})
	@JsonIgnoreProperties("zoos")
	private List<Animal> animals = new ArrayList<>();

	@OneToMany(mappedBy = "zoo")
	@JsonIgnoreProperties("zoo")
	private List<Telephone> telephones = new ArrayList<>();

	public Zoo()
	{
	}

	public Zoo(String zooname)
	{
		this.zooname = zooname;
	}

	public long getZooid()
	{
		return zooid;
	}

	public String getZooname()
	{
		return zooname;
	}

	public void setZooname(String zooname)
	{
		this.zooname = zooname;
	}

	public List<Animal> getAnimals()
	{
		return animals;
	}

	public void setAnimals(List<Animal> animals)
	{
		this.animals = animals;
	}

	public List<Telephone> getTelephones()
	{
		return telephones;
	}

	public void setTelephones(List<Telephone> telephones)
	{
		this.telephones = telephones;
	}
}
