package com.example.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;

@RestController
@RequestMapping (value="/users")
public class UserResources {
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria =  new User("1", "Maria Silva", "maria123@gmail.com");
		User alex =  new User("2", "Alex Green", "agree123@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,alex));
		return ResponseEntity.ok().body(list);
		
	}
}
