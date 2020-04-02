package com.stackroute.userapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.userapp.model.User;
import com.stackroute.userapp.service.UserService;


@RestController
@RequestMapping("api/v1/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> userlist = userService.getalluser(); 
		return new ResponseEntity<List<User>>(userlist,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		userService.save(user);
		return new ResponseEntity<User>(HttpStatus.CREATED);
	}
	
	
	
}
