package com.restaurant.management.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.restaurant.management.model.Plate;
import com.restaurant.management.repository.PlateRepository;


@Service 
public class PlateService {

	@Autowired  
	PlateRepository plateRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Plate> getAllPlatesByRestaurant(int id)   
	{  
		List<Plate> plates = new ArrayList<Plate>();  
		plateRepository.findPlateByIdrestaurant(id).forEach(plate1 -> plates.add(plate1));  
		return plates;  	
	}  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Plate> getAllPlates()   
	{  
		List<Plate> plates = new ArrayList<Plate>();  
		plateRepository.findAll().forEach(plate1 -> plates.add(plate1));  
		return plates;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Plate getPlatesById(int id)   
	{  
		return plateRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Plate plates)   
	{  
		plateRepository.save(plates);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		plateRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Plate plates, int plateid)   
	{  
		plateRepository.save( plates);  
	}  


}