package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repos.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("/zoosService")
public class ZoosServiceImpl implements ZooService
{
	@Autowired
	private ZooRepository zooRepository;

	@Override
	public ArrayList<Zoo> findAll()
	{
		ArrayList<Zoo> list = new ArrayList<>();
		zooRepository.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
}
