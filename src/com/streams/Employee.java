package com.streams;

public class Employee {
	
	Integer emp_Id;
	
	String emp_Name;
	
	Double emp_Salary;
	
	public Employee(Integer emp_Id,String emp_Name,Double emp_Salary) {
		this.emp_Id=emp_Id;
		this.emp_Name=emp_Name;
		this.emp_Salary=emp_Salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", emp_Salary=" + emp_Salary + "]";
	}

	
	
	
	

}
