package com.practice.booking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookingController {
	
	@Autowired
	private BookingDetailsRepo br;
	
	@GetMapping("/details")
	private List<BookingDetailsEntity> getall() {
		return br.findAll();
	}
	
	@GetMapping("/mode/{mode}")
	public BookingDetailsEntity getbycar(@PathVariable String mode) {
		return br.findByMode(mode);
	}
	
	@GetMapping("/discount/mode/{mode}")
	public BookingDetailsBean getdiscount(@PathVariable String mode) {
		Map<String,String> urivariables =new HashMap<String,String>();
		urivariables.put("mode",mode);
		
		
		ResponseEntity<BookingDetailsBean> ResponseEntity = new RestTemplate().getForEntity("http://localhost:8080/mode/{mode}", BookingDetailsBean.class,
	            urivariables);
		
		BookingDetailsBean response = ResponseEntity.getBody();
		
		return new BookingDetailsBean(response.getPlace_from(),response.getPlace_to(),response.getMode(),response.getPrice(),response.getPrice()-(0.2*response.getPrice()));
		
	}
	
	

}
