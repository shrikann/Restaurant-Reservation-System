package com.example.demo.modelproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="additionaldetails")

public class SeatModel {
	@Id
	private Long custalternatemobile;
	private String state;
	private String city;
	public Long getCustalternatemobile() {
		return custalternatemobile;
	}
	public void setCustalternatemobile(Long custalternatemobile) {
		this.custalternatemobile = custalternatemobile;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public SeatModel(Long custalternatemobile, String state, String city) {
		super();
		this.custalternatemobile = custalternatemobile;
		this.state = state;
		this.city = city;
	}
	public SeatModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
