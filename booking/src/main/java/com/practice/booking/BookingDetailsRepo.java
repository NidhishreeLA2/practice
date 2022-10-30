package com.practice.booking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDetailsRepo extends JpaRepository<BookingDetailsEntity,Integer>{
BookingDetailsEntity findByMode(String mode);
}
