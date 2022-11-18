package com.restaurant.management.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.restaurant.management.model.Commande;
import com.restaurant.management.repository.CommandeRepository;


@Service 
public class CommandeService {

	@Autowired  
	CommandeRepository commandeRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Commande> getAllCommandes()   
	{  
		List<Commande> commandes = new ArrayList<Commande>();  
		commandeRepository.findAll().forEach(commande1 -> commandes.add(commande1));  
		return commandes;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Commande getCommandesById(int id)   
	{  
		return commandeRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Commande commandes)   
	{  
		commandeRepository.save(commandes);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		commandeRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Commande commandes, int commandeid)   
	{  
		commandeRepository.save( commandes);  
	}  


}
