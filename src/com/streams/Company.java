package com.streams;

public class Company {
	
	Integer id;
	
	String name;
	
	Double salary;
	
	String location;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Company(Integer id, String name, Double salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}
	
	

}
