package com.mindtree.travelbookingapplication.service.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelbookingapplication.entity.Days;
import com.mindtree.travelbookingapplication.repository.DaysRepository;
import com.mindtree.travelbookingapplication.service.DaysService;

@Service
public class DaysServiceImplementation implements DaysService {

	
	@Autowired
	DaysRepository daysRepository;
	
	
	@Override
	public List<Days> getAllDays() {
		
		return daysRepository.findAll();
	}

}
