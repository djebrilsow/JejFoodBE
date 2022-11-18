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

import com.restaurant.management.model.Commande;
import com.restaurant.management.service.CommandeService;

@RestController 
@CrossOrigin(origins = "*")
public class CommandeController {
	
	//autowire the BooksService class  
		@Autowired  
		CommandeService commandeService;  

		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/commande")
		
		private List<Commande> getAllCommandes()   
		{  
			return commandeService.getAllCommandes();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/commande/{commandeid}")  
		private Commande getCommandes(@PathVariable("commandeid") int commandeid)   
		{  
			return commandeService.getCommandesById(commandeid);  
		}  


		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/commande/{commandeid}")  
		private void deleteCommande(@PathVariable("commandeid") int commandeid)   
		{  
			commandeService.delete(commandeid);  
		} 

		@PostMapping("/commande")  
		private int saveCommande(@RequestBody Commande commande)   
		{  
			commandeService.saveOrUpdate(commande);  
			return commande.getIdCommande();  
		} 

		//creating put mapping that updates the book detail
		//@CrossOrigin(origins = "*")
		@PutMapping("/commande")  
		private Commande update(@RequestBody  Commande commande)   
		{  
			commandeService.saveOrUpdate(commande);  
			return commande;  
		}  

}
