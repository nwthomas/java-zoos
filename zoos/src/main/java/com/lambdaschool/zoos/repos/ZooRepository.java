package com.lambdaschool.zoos.repos;

import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{

}
