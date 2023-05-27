
package com.mscdemosoap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscdemosoap.model.Room;

public interface RoomRepo extends JpaRepository<Room, Long> {
	
	Room findByRoomId(long roomId);
}
