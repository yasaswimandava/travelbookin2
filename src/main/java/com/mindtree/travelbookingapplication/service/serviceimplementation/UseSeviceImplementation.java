package com.mindtree.travelbookingapplication.service.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelbookingapplication.entity.User;
import com.mindtree.travelbookingapplication.repository.UserRepository;
import com.mindtree.travelbookingapplication.service.UserService;

@Service
public class UseSeviceImplementation implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

}
