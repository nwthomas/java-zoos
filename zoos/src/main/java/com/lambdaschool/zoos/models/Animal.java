package com.lambdaschool.zoos.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")
public class Animal
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long animalid;

	private String animaltype;

	@ManyToMany(mappedBy = "zooid")
	private List<Zoo> zoos = new ArrayList<>();

	public Animal()
	{
	}

	public Animal(String animaltype)
	{
		this.animaltype = animaltype;
	}

	public long getAnimalid()
	{
		return animalid;
	}

	public String getAnimaltype()
	{
		return animaltype;
	}

	public void setAnimaltype(String animaltype)
	{
		this.animaltype = animaltype;
	}
}
