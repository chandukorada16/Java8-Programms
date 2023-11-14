package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Siva", 35, "Sales", 30000.00);
		Employee e2=new Employee(102, "Bala", 42, "HR", 42000.00);
		Employee e3=new Employee(103, "Ramesh", 23, "Development", 20000.00);
		Employee e4=new Employee(104, "Devi", 54, "Sales",48000.00);
		Employee e5=new Employee(105, "Ramya", 25, "Development", 22000.00);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
//printEmployees
		
		list.stream().forEach(i->System.out.println(i));
		
		System.out.println("--------------------------");
//printEmployeeNames
		
		list.stream()
		.map(Employee::getName)
		.forEach(i->System.out.println(i));
		
		System.out.println("-----------------------------");
//HighestEmployeeSalary
		
		list.stream()
		.max(Comparator.comparing(Employee::getSalary))
		.map(Employee::getName).get();
	

		System.out.println("-----------------------");
//LowestEmployeeSalary
		
		Optional<Employee> min = list.stream()
				.min(Comparator.comparing(Employee::getSalary));
				System.out.println(min);
				
		System.out.println("-------------------------------");
//printNumberOfDEmployees
		
		long count = list.stream()
		.map(Employee::getName)
		.distinct()
		.count();
		System.out.println(count);
		
		System.out.println("-----------------------------------");
//sortEmployees
		
		list.stream()
		.sorted(Comparator.comparing(Employee::getName))
		.forEach(i->System.out.println(i));
		
		System.out.println("---------------------------------");
//sortReverseEmployee
		
//		list.stream()
//		.sorted(Comparator.reverseOrder().com
	}

}
