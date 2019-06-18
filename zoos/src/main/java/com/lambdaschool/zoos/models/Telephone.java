package com.lambdaschool.zoos.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "telephone")
public class Telephone
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long phoneid;

	private String phonetype;
	private String phonenumber;

	public Telephone()
	{
	}

	public Telephone(String phonetype, String phonenumber)
	{
		this.phonetype = phonetype;
		this.phonenumber = phonenumber;
	}

	public long getPhoneid()
	{
		return phoneid;
	}
	public String getPhonetype()
	{
		return phonetype;
	}

	public void setPhonetype(String phonetype)
	{
		this.phonetype = phonetype;
	}

	public String getPhonenumber()
	{
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
}
