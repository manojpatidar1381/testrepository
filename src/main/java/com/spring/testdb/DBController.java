package com.spring.testdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

	@Autowired
	TestDBRepository testRepository;
	
	
	@PostMapping("/save")
	public Person saveData(@RequestBody Person person) 
	{
     		return testRepository.save(person);
	}
}
