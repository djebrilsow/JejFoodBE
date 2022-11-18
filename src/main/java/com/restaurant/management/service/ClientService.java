package com.restaurant.management.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.restaurant.management.model.Client;
import com.restaurant.management.repository.ClientRepository;


@Service 
public class ClientService {

	@Autowired  
	ClientRepository clientRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Client> getAllClients()   
	{  
		List<Client> clients = new ArrayList<Client>();  
		clientRepository.findAll().forEach(client1 -> clients.add(client1));  
		return clients;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Client getClientsById(int id)   
	{  
		return clientRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Client clients)   
	{  
		clientRepository.save(clients);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		clientRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Client clients, int clientid)   
	{  
		clientRepository.save( clients);  
	}  


}
