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
public class Days {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long dayId;
	
	private String dayName;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "days")
	private List<Train> trains;

	public Days() {
		super();
	}

	public Days(String dayName, List<Train> trains) {
		super();
		this.dayName = dayName;
		this.trains = trains;
	}

	public long getDayId() {
		return dayId;
	}

	public void setDayId(long dayId) {
		this.dayId = dayId;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	

	
	

}
