package com.example.demo.ProjectOla.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="forgotpass")
public class ForgotpassEntity {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
	   private int id;
	   @Column(name="username")
	   private String username;
	   @Column(name="newpassword")
	   private String newpassword;
	public ForgotpassEntity(int id, String username, String newpassword) {
		super();
		this.id = id;
		this.username = username;
		this.newpassword = newpassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return newpassword;
	}
	public void setPassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public ForgotpassEntity() {
		super();
	}
}
