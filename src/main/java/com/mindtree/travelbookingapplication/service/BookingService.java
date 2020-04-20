package com.mindtree.travelbookingapplication.service;

import java.util.List;

import com.mindtree.travelbookingapplication.entity.Booking;
import com.mindtree.travelbookingapplication.entity.Train;
import com.mindtree.travelbookingapplication.entity.User;

public interface BookingService {

	List<Booking> getAllBookings();

	void saveBooking(User user, Train train);

	void add(Booking book);

}
