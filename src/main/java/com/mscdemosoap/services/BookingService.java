package com.mscdemosoap.services;

import com.mscdemosoap.model.Booking;

public interface BookingService {

	
	void AddBooking (Booking booking);
	
//	Booking getBookingById(long bookingId);
	
	void updateBooking(Booking booking);
	
	void deleteBooking(long bookingId);
}


