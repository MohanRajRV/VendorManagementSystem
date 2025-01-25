package com.api.jpa.restapi_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cloud_vendor")
public class Vendor {

	@Id
	@Column(name = "id")
	Integer id;
	@Column(name = "name")
	String name;
	@Column(name = "address")
	String Address;
	@Column(name = "phoneno")
	String phoneNO;
	
	
	


	public Vendor() {
		super();
	}


	public Vendor(int id, String name, String address, String phoneNO) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.phoneNO = phoneNO;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getPhoneNO() {
		return phoneNO;
	}


	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", Address=" + Address + ", phoneNO=" + phoneNO + "]";
	}
	
	
}

