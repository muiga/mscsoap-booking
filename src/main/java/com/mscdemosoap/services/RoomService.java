package com.mscdemosoap.services;

import com.mscdemosoap.model.Room;

public interface RoomService {
	
	void AddRoom (Room room);
	
//	Room getRoomById(long roomId);
	
	void updateRoom(Room room);
	
	void deleteRoom(long roomId);

}
