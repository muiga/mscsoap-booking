package com.mscdemosoap.endpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.mscdemosoap.model.Booking;
import com.mscdemosoap.services.BookingService;

import all.mscdemosoap.com.AddBookingRequest;
import all.mscdemosoap.com.AddBookingResponse;
import all.mscdemosoap.com.ServiceStatus;

public class BookingEndPoint {

private static final String NAMESPACE_URI = "http://com.mscdemosoap.all";
	
	@Autowired
	private BookingService bookingService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addRoomRequest")
	@ResponsePayload
	public AddBookingResponse addBooking(@RequestPayload AddBookingRequest request) {
		
		AddBookingResponse response = new AddBookingResponse();
		ServiceStatus serviceStatus = new ServiceStatus();
		
		Booking booking= new Booking();
		BeanUtils.copyProperties(request.getBookingInfo(), booking);
		bookingService.AddBooking(booking);
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Room added Successfully");
		response.setServiceStatus(serviceStatus);
		return response;
	}
}
