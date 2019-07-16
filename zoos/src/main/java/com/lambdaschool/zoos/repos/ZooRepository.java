package com.lambdaschool.zoos.repos;

import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ZooRepository extends PagingAndSortingRepository<Zoo, Long>
{

}
