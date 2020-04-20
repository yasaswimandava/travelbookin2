package com.mindtree.travelbookingapplication.service.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelbookingapplication.entity.Booking;
import com.mindtree.travelbookingapplication.entity.Train;
import com.mindtree.travelbookingapplication.entity.User;
import com.mindtree.travelbookingapplication.repository.BookingRepository;
import com.mindtree.travelbookingapplication.repository.UserRepository;
import com.mindtree.travelbookingapplication.service.BookingService;

@Service
public class BookingServiceImplementation implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookingService bookigService;
	@Override
	public List<Booking> getAllBookings() {
		
		return bookingRepository.findAll();
	}

//	@Override
//	public void saveBooking(long userId, Train train) {
//		Booking book=new Booking();
//		book.setUsers(userRepository.findById(userId).get());
//		book.setTrains(train);
//		bookingRepository.save(book);
//		
//	}

	@Override
	public void saveBooking(User user, Train train) {
		Booking book=new Booking();
		book.setFromSource(train.getSource());
		book.setToDestination(train.getDestination());
		book.setTrains(train);
		book.setUsers(user);
		bookigService.add(book);
		
	}

	@Override
	public void add(Booking book) {
		
		bookingRepository.save(book);
	}

}
