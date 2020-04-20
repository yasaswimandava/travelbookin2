package com.mindtree.travelbookingapplication.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	
	private String fromSource;
	private String toDestination;
	private Date date;
	
	@OneToOne
	private User users;
	
	@OneToOne
	private Train trains;

	public Booking() {
		super();
	}

	public Booking(String fromSource, String toDestination, Date date, User users, Train trains) {
		super();
		this.fromSource = fromSource;
		this.toDestination = toDestination;
		this.date = date;
		this.users = users;
		this.trains = trains;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getFromSource() {
		return fromSource;
	}

	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
	}

	public String getToDestination() {
		return toDestination;
	}

	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Train getTrains() {
		return trains;
	}

	public void setTrains(Train trains) {
		this.trains = trains;
	}

	
	
}
