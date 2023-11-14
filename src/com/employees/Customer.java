package com.employees;

import java.util.List;

public class Customer {
	
	private int id;
	
	private String name;
	
	private String location;
	
	private String emailId;
	
	private long contactNo;
	
	private List<Address> Address;

	public Customer(int id, String name, String location, String emailId, long contactNo,
			List<com.employees.Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.emailId = emailId;
		this.contactNo = contactNo;
		Address = address;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public List<Address> getAddress() {
		return Address;
	}

	public void setAddress(List<Address> address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", location=" + location + ", emailId=" + emailId
				+ ", contactNo=" + contactNo + ", Address=" + Address + "]";
	}
	
	
	

}
