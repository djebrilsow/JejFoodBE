package com.restaurant.management.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.management.model.Client;
import com.restaurant.management.service.ClientService;

@RestController 
@CrossOrigin(origins = "*")
public class ClientController {
	
	//autowire the BooksService class  
		@Autowired  
		ClientService clientService;  

		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/client")
		
		private List<Client> getAllClients()   
		{  
			return clientService.getAllClients();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/client/{clientid}")  
		private Client getClients(@PathVariable("clientid") int clientid)   
		{  
			return clientService.getClientsById(clientid);  
		}  


		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/client/{clientid}")  
		private void deleteClient(@PathVariable("clientid") int clientid)   
		{  
			clientService.delete(clientid);  
		} 

		@PostMapping("/client")  
		private int saveClient(@RequestBody Client client)   
		{  
			clientService.saveOrUpdate(client);  
			return client.getIdClient();  
		} 

		//creating put mapping that updates the book detail
		//@CrossOrigin(origins = "*")
		@PutMapping("/client")  
		private Client update(@RequestBody  Client client)   
		{  
			clientService.saveOrUpdate(client);  
			return client;  
		}  

}
