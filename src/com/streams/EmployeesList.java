package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesList {

	public static void main(String[] args) {
		List<Employees> empList=new ArrayList<>();
		empList.add(new Employees(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Employees(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		empList.add(new Employees(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new Employees(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		empList.add(new Employees(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		empList.add(new Employees(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		empList.add(new Employees(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		empList.add(new Employees(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		empList.add(new Employees(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		empList.add(new Employees(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		empList.add(new Employees(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList.add(new Employees(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		empList.add(new Employees(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		empList.add(new Employees(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		empList.add(new Employees(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList.add(new Employees(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		
	//1. How many male and female employees are there in the organization ?
		Map<String, Long> noOfGenders = empList.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.counting()));
		System.out.println(noOfGenders);
		
		System.out.println("-------------------------------------------");
//2.Print the name of all departments in the organization ?
		empList.stream().map(Employees::getDepartment).distinct().forEach(h->System.out.println(h));
		
		System.out.println("--------------------------------------------");
//3.What is the average age of male and female employees ?
		Map<String, Double> collect = empList.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.averagingInt(Employees::getAge)));
		System.out.println(collect);
	}

}
