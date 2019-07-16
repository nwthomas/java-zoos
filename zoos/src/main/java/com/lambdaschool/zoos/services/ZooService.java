package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface ZooService
{
	ArrayList<Zoo> findAll(Pageable pageable);

	Zoo update(Zoo zoo, long id);
}
