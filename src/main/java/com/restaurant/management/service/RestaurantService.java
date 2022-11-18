package com.restaurant.management.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.restaurant.management.model.Restaurant;
import com.restaurant.management.repository.RestaurantRepository;

//defining the business logic  
@Service 

public class RestaurantService {

	@Autowired  
	RestaurantRepository restaurantRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Restaurant> getAllRestaurants()   
	{  
		List<Restaurant> restaurants = new ArrayList<Restaurant>();  
		restaurantRepository.findAll().forEach(restaurant1 -> restaurants.add(restaurant1));  
		return restaurants;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Restaurant getRestaurantsById(int id)   
	{  
		return restaurantRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Restaurant restaurants)   
	{  
		restaurantRepository.save(restaurants);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		restaurantRepository.deleteById(id);  
	} 

	//updating a record  
	public void update(Restaurant restaurants, int restaurantid)   
	{  
		restaurantRepository.save( restaurants);  
	}  
}


