package com.practice.booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_details")
public class BookingDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String place_from;
	public String getPlace_from() {
		return place_from;
	}
	public void setPlace_from(String place_from) {
		this.place_from = place_from;
	}
	public String getPlace_to() {
		return place_to;
	}
	public void setPlace_to(String place_to) {
		this.place_to = place_to;
	}
	private String place_to;
	private String mode;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
