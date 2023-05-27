package com.mscdemosoap.services;

import com.mscdemosoap.model.Client;

public interface ClientService {
	
	void AddClient (Client client);
	
//	Client getClientById(long clientId);
	
	void updateClient(Client client);
	
	void deleteClient(long clientId);

}
