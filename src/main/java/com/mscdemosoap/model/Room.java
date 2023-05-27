package com.mscdemosoap.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="room")

public class Room implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "room_id")
	private long roomId;
	
	@Column(name = "room_no")
	private long roomNumber;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "price")
	private float price;
	
	
	
	
	
	public long getRoomId() {
		return roomId;
	}
	
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	
	public long getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(long roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
		
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
