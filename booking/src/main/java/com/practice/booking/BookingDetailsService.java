package com.practice.booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingDetailsService {
	
	@Autowired
	private BookingDetailsRepo br;
	
	private List<BookingDetailsEntity> getall() {
		return br.findAll();
	}

}
