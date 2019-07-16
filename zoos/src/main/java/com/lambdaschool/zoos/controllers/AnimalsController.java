package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animals")
public class AnimalsController
{
	@Autowired
	private AnimalService animalService;

	@GetMapping(value = "/count", produces = {"application/json"})
	public ResponseEntity<?> getAnimalsCountWithZoos()
	{
		return new ResponseEntity<>(animalService.getAnimalsWithZooCount(), HttpStatus.OK);
	}
}
