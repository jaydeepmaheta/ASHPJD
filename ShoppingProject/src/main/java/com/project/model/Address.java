package com.project.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {
	
   private static final long serialVersionUID = 1L;
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;

   @Column(name = "city")
   private String city;

   @Column(name = "state")
   private String state;
   
   @Column(name = "zip")
   private int zip;
   
   public Address(){}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
   
   

}
