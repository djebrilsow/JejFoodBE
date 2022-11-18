package com.restaurant.management.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 

public class Plate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int idPlate;  
	@Column  
	private String namePlate;  
	@Column  
	private String price;  
	@Column  
	private String  description;
	@Column  
	private String  photo;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idrestaurant", referencedColumnName="id")
	private Restaurant restaurant;
	
	public int getIdPlate() {
		return idPlate;
	}
	public void setIdPlate(int idPlate) {
		this.idPlate = idPlate;
	}

	public String getNamePlate() {
		return namePlate;
	}
	public void setNamePlate(String namePlate) {
		this.namePlate = namePlate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public String toString() {
		return "Plate [idPlate=" + idPlate + ", namePlate=" + namePlate + ", price=" + price + ", description="
				+ description + ", photo=" + photo + ", restaurant=" + restaurant + "]";
	}

   
}
