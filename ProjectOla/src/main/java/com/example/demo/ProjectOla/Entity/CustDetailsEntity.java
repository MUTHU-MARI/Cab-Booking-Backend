package com.example.demo.ProjectOla.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="custdetails")
public class CustDetailsEntity {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="id")
     private int id;
     @Column(name="custname")
     private String custname;
     @Column(name="custlocation")
     private String custlocation;
     @Column(name="custaddress")
     private String custaddress;
	public CustDetailsEntity(int id, String custname, String custlocation, String custaddress) {
		super();
		this.id = id;
		this.custname = custname;
		this.custlocation = custlocation;
		this.custaddress = custaddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustlocation() {
		return custlocation;
	}
	public void setCustlocation(String custlocation) {
		this.custlocation = custlocation;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public CustDetailsEntity() {
		super();
	}
     
}
