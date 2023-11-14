package com.streams;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Chandu",30000.00);
		Employee emp2=new Employee(102,"Harsha",165000.00);
		Employee emp3=new Employee(103,"Srinivas",185000.00);
		
		List<Employee> employees=Arrays.asList(emp1,emp2,emp3);
		employees.stream().filter(i->i.emp_Salary>100000.00).forEach(i->System.out.println(i));

	}

}
