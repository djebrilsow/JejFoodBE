package com.restaurant.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.restaurant.management.model.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Integer> {

}
