package com.kmb.BankApp.Srvice.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmb.BankApp.Entity.RegisterEntity;
import com.kmb.BankApp.Repository.UserRepository;
import com.kmb.BankApp.Service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repository;
	
	public UserServiceImpl(UserRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public RegisterEntity insertUser(RegisterEntity register) {
		
		return repository.save(register);
	}

}
