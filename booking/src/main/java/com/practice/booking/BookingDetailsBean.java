package com.practice.booking;

public class BookingDetailsBean {
	
	
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
	private double discounted_price;
	
	

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

	public double getDiscounted_price() {
		return discounted_price;
	}

	public void setDiscounted_price(double discounted_price) {
		this.discounted_price = discounted_price;
	}

	public BookingDetailsBean() {
		
	}
	
public BookingDetailsBean(String from,String to,String mode,int price,double d) {
		super();
		this.place_from = from;
		this.place_to = to;
		this.mode = mode;
		this.price = price;
		this.discounted_price = d;
	}
}
