package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.repos.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service("zoosService")
public class ZoosServiceImpl implements ZooService
{
	@Autowired
	private ZooRepository zooRepository;

	@Override
	public ArrayList<Zoo> findAll(Pageable pageable)
	{
		ArrayList<Zoo> list = new ArrayList<>();
		zooRepository.findAll(pageable).iterator().forEachRemaining(list::add);
		return list;
	}

	@Transactional
	@Override
	public Zoo update(Zoo updateZoo, long id)
	{
		Zoo currentZoo = zooRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));

		if (updateZoo.getZooname() != null)
		{
			currentZoo.setZooname(updateZoo.getZooname());
		}

		return zooRepository.save(currentZoo);
	}
}
