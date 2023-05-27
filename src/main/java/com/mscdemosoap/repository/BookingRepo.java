package com.mscdemosoap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscdemosoap.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long> {

//	Booking findByBookingId(long bookingId);
}


