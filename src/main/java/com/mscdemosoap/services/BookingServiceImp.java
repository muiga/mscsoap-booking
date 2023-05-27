package com.mscdemosoap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscdemosoap.model.Booking;
import com.mscdemosoap.repository.BookingRepo;

@Service
public class BookingServiceImp implements BookingService{

	@Autowired
	BookingRepo bookingRepo;

	@Override
	public void AddBooking(Booking booking) {
		bookingRepo.save(booking);
		
	}

//	@Override
//	public Booking getBookingById(long bookingId) {
//		Booking obj = bookingRepo.findByBookingId(bookingId);
//		return obj;
//	}

	@Override
	public void updateBooking(Booking booking) {
		bookingRepo.save(booking);
		
	}

	@Override
	public void deleteBooking(long bookingId) {
		bookingRepo.deleteById(bookingId);
		
	}
	
	
	
}
