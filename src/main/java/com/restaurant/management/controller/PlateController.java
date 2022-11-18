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

import com.restaurant.management.model.Plate;
import com.restaurant.management.service.PlateService;

@RestController 
@CrossOrigin(origins = "*")
public class PlateController {
	
	//autowire the BooksService class  
		@Autowired  
		PlateService plateService;  
        @GetMapping("/platesofrestaurant/{id}")
		
		private List<Plate> getAllPlatesByRestaurant(@PathVariable("id") int id)   
		{  
			return plateService.getAllPlatesByRestaurant(id);  
		}  
		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/plate")
		
		private List<Plate> getAllPlates()   
		{  
			return plateService.getAllPlates();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/plate/{plateid}")  
		private Plate getPlates(@PathVariable("plateid") int plateid)   
		{  
			return plateService.getPlatesById(plateid);  
		}  


		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/plate/{plateid}")  
		private void deletePlate(@PathVariable("plateid") int plateid)   
		{  
			plateService.delete(plateid);  
		} 

		@PostMapping("/plate")  
		private int savePlate(@RequestBody Plate plate)   
		{  
			plateService.saveOrUpdate(plate);  
			return plate.getIdPlate();  
		} 

		//creating put mapping that updates the book detail
		//@CrossOrigin(origins = "*")
		@PutMapping("/plate")  
		private Plate update(@RequestBody  Plate plate)   
		{  
			plateService.saveOrUpdate(plate);  
			return plate;  
		}  

}