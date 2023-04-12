package com.Validation.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Validation.example.Service.UserService;
import com.Validation.example.Throwexception.UsernotFoundException;
import com.Validation.example.dta.UserRequst;
import com.Validation.example.entity.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService uservice;
	@PostMapping("/create")
	public ResponseEntity<User> saveUserDetails(@RequestBody @Valid UserRequst urequest){
		return new ResponseEntity<>(uservice.saveUser(urequest),HttpStatus.CREATED);
		
	}
	@GetMapping("/fetchAll")
public ResponseEntity<List<User>> getUserDetails(){
		return ResponseEntity.ok(uservice.getAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id) throws UsernotFoundException{
		return ResponseEntity.ok(uservice.getUser(id));
	}
}
