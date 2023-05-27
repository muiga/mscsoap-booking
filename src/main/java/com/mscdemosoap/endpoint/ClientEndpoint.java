package com.mscdemosoap.endpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.mscdemosoap.model.Client;
import com.mscdemosoap.services.ClientService;

import all.mscdemosoap.com.AddClientRequest;
import all.mscdemosoap.com.AddClientResponse;
import all.mscdemosoap.com.ServiceStatus;

@Endpoint
public class ClientEndpoint {
	
	private static final String NAMESPACE_URI = "http://com.mscdemosoap.all";
	
	@Autowired
	private ClientService clientService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addClientRequest")
	@ResponsePayload
	public AddClientResponse addClient(@RequestPayload AddClientRequest request) {
		
		AddClientResponse response = new AddClientResponse();
		ServiceStatus serviceStatus = new ServiceStatus();
		
		Client client = new Client();
		BeanUtils.copyProperties(request.getClientInfo(), client);
		clientService.AddClient(client);
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Client added Successfully");
		response.setServiceStatus(serviceStatus);
		return response;
	}
	
	
//	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClientByIdRequest")
//	@ResponsePayload
//	public ClientResponse getClient(@RequestPayload ClientByIdRequest request) {
//		
//		GetClientResponse response = new GetClientResponse();		
//		ClientInfo clientInfo = new ClientInfo();
//		BeanUtils.copyProperties(clientService.getClientById(request.getClientId()), clientInfo);
//		response.setClientInfo(clientInfo);
//		return response;
//	}
//	
	
//	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateClientRequest")
//	@ResponsePayload
//	public UpdateClientResponse updateClient(@RequestPayload UpdateClientRequest request) {
//		
//		Client client = new Client();
//		BeanUtils.copyProperties(request.getClientInfo(), client);
//		clientService.updateClient(client);
//		ServiceStatus serviceStatus = new ServiceStatus();
//		serviceStatus.setStatus("SUCCESS");
//		serviceStatus.setMessage("Client updated Successfully");
//		UpdateClientResponse response = new UpdateClientResponse();
//		response.setServiceStatus(serviceStatus);
//		return response;
//	}
//	
//	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteClientRequest")
//	@ResponsePayload
//	public DeleteClientResponse deleteClient(@RequestPayload DeleteClientRequest request) {
//		clientService.deleteClient(request.getEmployeeId());
//		ServiceStatus serviceStatus = new ServiceStatus();
//		
//		serviceStatus.setStatus("SUCCESS");
//		serviceStatus.setMessage("Client deleted Successfully");
//		DeleteClientResponse response = new DeleteClientResponse();
//		response.setServiceStatus(serviceStatus);
//		return response;
//	}
//	

}