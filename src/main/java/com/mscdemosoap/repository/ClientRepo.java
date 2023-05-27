package com.mscdemosoap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscdemosoap.model.Client;

public interface ClientRepo extends JpaRepository<Client, Long> {
	
//	Client findByClientId(long clientId);
}
