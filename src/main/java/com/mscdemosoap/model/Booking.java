package com.mscdemosoap.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booking")

public class Booking implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "booking_id")
	private long bookingId;
	
	@Column(name = "cost")
	private float cost;
	
	@Column(name = "days")
	private long days;
	
	@Column(name = "client_id")
	private long clientId;

	
	public long getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	
	
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	public long getdays() {
		return days;
	}
	
	public void setdays(long days) {
		this.days = days;
	}
	
	public long getClientId() {
		return clientId;
	}
	
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	
	
	
}
	