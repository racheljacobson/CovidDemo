package com.sw409.coviddemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="residentTable")
public class Resident {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String name;
	private int age;
	String product; //Moderna or Phfyzer
	String vaccine; //1st, 2nd, booster
	String date; // MM/dd/yyyy
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Resident(String name, int age, String product, String vaccine, String date) {
		
		this.name = name;
		this.age = age;
		this.product = product;
		this.vaccine = vaccine;
		this.date = date;
	}
	
	public Resident() {
		
	}
	
	

	
	

}
