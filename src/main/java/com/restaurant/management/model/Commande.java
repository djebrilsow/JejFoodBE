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

public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int idCommande;  
	@Column  
	private double prixTotal;  
	@Column  
	private String lots;
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	public String getLots() {
		return lots;
	}
	public void setLots(String lots) {
		this.lots = lots;
	}
	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", prixTotal=" + prixTotal + ", lots=" + lots
				+ ", getIdCommande()=" + getIdCommande() + ", getPrixTotal()=" + getPrixTotal() + ", getLots()="
				+ getLots() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	} 
	
	
	
	 
	

}
