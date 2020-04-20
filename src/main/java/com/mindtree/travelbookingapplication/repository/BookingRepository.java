package com.mindtree.travelbookingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.travelbookingapplication.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
