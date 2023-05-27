package com.mscdemosoap.endpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.mscdemosoap.model.Room;
import com.mscdemosoap.services.RoomService;


import all.mscdemosoap.com.AddRoomRequest;
import all.mscdemosoap.com.AddRoomResponse;
import all.mscdemosoap.com.ServiceStatus;

public class RoomEndPoint {

	
private static final String NAMESPACE_URI = "http://com.mscdemosoap.all";
	
	@Autowired
	private RoomService roomService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addRoomRequest")
	@ResponsePayload
	public AddRoomResponse addRoom(@RequestPayload AddRoomRequest request) {
		
		AddRoomResponse response = new AddRoomResponse();
		ServiceStatus serviceStatus = new ServiceStatus();
		
		Room room = new Room();
		BeanUtils.copyProperties(request.getRoomInfo(), room);
		roomService.AddRoom(room);
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Room added Successfully");
		response.setServiceStatus(serviceStatus);
		return response;
	}
	
}
