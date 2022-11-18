package com.restaurant.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restaurant.management.model.Plate;

public interface PlateRepository  extends CrudRepository<Plate, Integer>{
	@Query("SELECT a FROM com.restaurant.management.model.Plate a WHERE a.restaurant.id = :idOfRestaurant") 
	List<Plate> findPlateByIdrestaurant(@Param("idOfRestaurant") int idOfRestaurant);

}