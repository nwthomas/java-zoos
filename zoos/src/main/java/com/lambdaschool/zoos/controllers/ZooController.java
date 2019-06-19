package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoos")
public class ZooController
{
	@Autowired
	private ZooService zooService;

	@GetMapping(value = "/zoos", produces = {"application/json"})
	public ResponseEntity<?> findAll()
	{
		return new ResponseEntity<>(zooService.findAll(), HttpStatus.OK);
	}
}
