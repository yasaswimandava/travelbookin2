package com.mindtree.travelbookingapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Train {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trainId;
	private String trainName;
	private String source;
	private String destination;
	private float cost;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "trains")
	private List<Booking> bookings;
	
	@ManyToMany
	private List<Days> days;

	public Train() {
		super();
	}

	public Train(long trainId, String trainName, String source, String destination, float cost, List<Booking> bookings,
			List<Days> days) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.cost = cost;
		this.bookings = bookings;
		this.days = days;
	}

	public long getTrainId() {
		return trainId;
	}

	public void setTrainId(long trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public List<Days> getDays() {
		return days;
	}

	public void setDays(List<Days> days) {
		this.days = days;
	}

	
}
