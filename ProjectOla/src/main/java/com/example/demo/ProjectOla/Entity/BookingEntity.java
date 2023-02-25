package com.example.demo.ProjectOla.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booking")
public class BookingEntity {
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       @Column(name="id")
       private int id;
       @Column(name="custlocation")
       private String custlocation;
       @Column(name="driverlocation")
       private String driverlocation;
       @Column(name="otp")
       private int otp;
       @Column(name="fare")
       private int fare;
       @Column(name="timing")
       private int timing;  
       public BookingEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustlocation() {
		return custlocation;
	}
	public void setCustlocation(String custlocation) {
		this.custlocation = custlocation;
	}
	public String getDriverlocation() {
		return driverlocation;
	}
	public void setDriverlocation(String driverlocation) {
		this.driverlocation = driverlocation;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getTiming() {
		return timing;
	}
	public void setTiming(int timing) {
		this.timing = timing;
	}
	public BookingEntity(int id, String custlocation, String driverlocation, int otp, int fare, int timing) {
		super();
		this.id = id;
		this.custlocation = custlocation;
		this.driverlocation = driverlocation;
		this.otp = otp;
		this.fare = fare;
		this.timing = timing;
	}
}
