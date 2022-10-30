package com.practice.booking;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingTest {
	@Autowired
	private BookingDetailsRepo br;
	
	@Test
	public void check() {
		List<BookingDetailsEntity> book = br.findAll();
		Assert.assertEquals(book.size(),4);
	}

}
