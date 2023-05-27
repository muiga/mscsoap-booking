package com.mscdemosoap.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.mscdemosoap.model.Room;
import com.mscdemosoap.repository.RoomRepo;

public class RoomServiceImp implements RoomService{
	
	@Autowired
	RoomRepo roomRepo;

	@Override
	public void AddRoom(Room room) {
		roomRepo.save(room);
		
	}

//	@Override
//	public Room getRoomById(long roomId) {
//		Room obj = roomRepo.findByRoomId(roomId);
//		return obj;
//	}

	@Override
	public void updateRoom(Room room) {
		roomRepo.save(room);
		
	}

	@Override
	public void deleteRoom(long roomId) {
		roomRepo.deleteById(roomId);
		
	}
	

}
