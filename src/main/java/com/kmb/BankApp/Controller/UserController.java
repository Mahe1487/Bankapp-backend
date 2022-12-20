package com.kmb.BankApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kmb.BankApp.Entity.RegisterEntity;
import com.kmb.BankApp.Service.IUserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/BankApp")
// Base Url is http://localhost:8080/BankApp
public class UserController {

	@Autowired
	private IUserService service;

	public UserController(IUserService service) {
		super();
		this.service = service;
	}
	
	// create insertUser REST API
	// http://localhost:8080/BankApp/register
	@PostMapping("/register")
	public ResponseEntity<RegisterEntity> insertUser(@RequestBody RegisterEntity register){
		return new ResponseEntity<RegisterEntity>(service.insertUser(register), HttpStatus.CREATED);
	}
}
