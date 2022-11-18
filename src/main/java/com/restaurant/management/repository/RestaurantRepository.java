package com.restaurant.management.repository;
import org.springframework.data.repository.CrudRepository;
import com.restaurant.management.model.Restaurant;  
//repository that extends CrudRepository  
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>  
{  
}  
