package com.lambdaschool.zoos.models;

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
	private List<Animal> animals = new ArrayList<>();

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
}
