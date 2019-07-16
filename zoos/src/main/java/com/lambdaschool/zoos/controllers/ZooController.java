package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.models.Zoo;
import com.lambdaschool.zoos.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zoos")
public class ZooController
{
	@Autowired
	private ZooService zooService;

	@GetMapping(value = "/zoos", produces = {"application/json"})
	public ResponseEntity<?> findAll(@PageableDefault(size = 2, page = 0)Pageable pageable)
	{
		return new ResponseEntity<>(zooService.findAll(pageable), HttpStatus.OK);
	}

	@PutMapping(value = "/admin/zoos/{id}")
	public ResponseEntity<?> updateZooById(@RequestBody Zoo updateZoo, @PathVariable long id)
	{
		System.out.println("Yes");
		zooService.update(updateZoo, id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
