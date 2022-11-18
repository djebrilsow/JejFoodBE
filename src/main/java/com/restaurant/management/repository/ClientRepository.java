package com.restaurant.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.restaurant.management.model.Client;

public interface ClientRepository  extends CrudRepository<Client, Integer> {

}
