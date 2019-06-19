package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.repos.AnimalRepository;
import com.lambdaschool.zoos.views.GetAnimalsWithZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("animalsService")
public class AnimalServiceImpl implements AnimalService
{
	@Autowired
	private AnimalRepository animalRepository;

	@Override
	public ArrayList<GetAnimalsWithZooCount> getAnimalsWithZooCount()
	{
		ArrayList<GetAnimalsWithZooCount> list = new ArrayList<>();
		animalRepository.getAnimalsWithZooCount().iterator().forEachRemaining(list::add);
		return list;
	}
}
