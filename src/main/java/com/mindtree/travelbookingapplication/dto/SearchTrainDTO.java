package com.mindtree.travelbookingapplication.dto;

public class SearchTrainDTO {
	
	private String source;
	private String destination;
	public SearchTrainDTO() {
		super();
	}
	public SearchTrainDTO(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
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
	
	
	
	
}
