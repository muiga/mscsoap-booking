package com.mscdemosoap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscdemosoap.model.Client;
import com.mscdemosoap.repository.ClientRepo;

@Service
public class ClientServiceImp implements ClientService{
	
	@Autowired
	ClientRepo clientRepo;
	
	
//	@Override
//	public Client getClientById(long clientId) {
//		
//		Client obj = clientRepo.findByClientId(clientId);
//		return obj;
//	}


	@Override
	public void AddClient(Client client) {
		clientRepo.save(client);
		
	}


	@Override
	public void updateClient(Client client) {
		clientRepo.save(client);
		
	}


	@Override
	public void deleteClient(long clientId) {
		clientRepo.deleteById(clientId);
	}
}
