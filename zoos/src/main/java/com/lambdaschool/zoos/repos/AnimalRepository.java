package com.lambdaschool.zoos.repos;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.views.GetAnimalsWithZooCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
//	SELECT a.animalid, a.animaltype, COUNT(za.zooid)
//	FROM animal AS a
//	JOIN zooanimals AS za
//	ON a.animalid = za.animalid

	@Query(value = "SELECT a.animalid, a.animaltype, COUNT(za.zooid) AS Zoocount FROM animal AS a JOIN zooanimals AS za ON a.animalid = za.animalid GROUP BY a.animalid", nativeQuery = true)
	ArrayList<GetAnimalsWithZooCount> getAnimalsWithZooCount();
}
