package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeDetails {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		System.out.println(
				"----------------------1.How many male and female employees are there in the organization-----------------------");
		/*
		 * Long
		 * male=employeeList.stream().filter(mal->mal.gender.equals("Male")).count();
		 * Long
		 * female=employeeList.stream().filter(fem->fem.gender.equals("Female")).count()
		 * ; System.out.println("Male Employees "+male+" "+"Female Employees "+female);
		 * }
		 */
		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		System.out.println(collect);

		System.out.println(
				"------------------------2.Print the name of all departments in the organization-------------------------------");
		employeeList.stream().map(dep -> dep.getDepartment()).distinct().forEach(dep -> System.out.println(dep));

		System.out.println(
				"---------------------3.What is the average age of male and female employees---------------------------------");
		/*
		 * Map<String, Double> map = employeeList.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingInt(Employee::getAge))); System.out.println(map);
		 */
		Map<String, Double> map = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingInt(e -> e.getAge())));
		System.out.println(map);

		System.out.println(
				"---------------------4.Get the details of highest paid employee in the organization--------------------------");

		Optional<Employee> maxSalary = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(em -> em.salary)));

		if (maxSalary.isPresent()) {
			Employee employee = maxSalary.get();
			System.out.println(employee);
		}

		System.out.println(
				"---------------------5.Get the names of all employees who have joined after 2015-------------------------------");

		employeeList.stream().filter(empl -> empl.yearOfJoining > 2015).map(emp -> emp.name)
				.forEach(e -> System.out.println(e));

		System.out.println(
				"---------------------6.Count the number of employees in each department------------------------------------");

		Map<String, Long> ed = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
		System.out.println(ed);

		System.out.println(
				"---------------------7.What is the average salary of each department------------------------------------");

		Map<String, Double> dep = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.averagingDouble(e -> e.getSalary())));
		System.out.println(dep);

		System.out.println(
				"-----------------8.Get the details of youngest male employee in the Development department--------------------------");

		Optional<Employee> min = employeeList.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
				.min(Comparator.comparing(e -> e.getAge()));
		if (min.isPresent()) {
			System.out.println(min.get());
		}

		System.out.println(
				"----------------------------9.Who has the most working experience in the organization-------------------------------------");

		Optional<Employee> optional = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(e -> e.getYearOfJoining())));

		if (optional.isPresent()) {
			System.out.println(optional.get());
		}

		System.out.println(
				"-------------10.How many male and female employees are there in the Sales team--------------------------------------");
		Map<String, Long> salesgender = employeeList.stream().filter(e -> e.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		System.out.println(salesgender);

		System.out.println(
				"----------------11.What is the average salary of male and female employees--------------------------------------");

		Map<String, Double> avg = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(e -> e.getSalary())));
		System.out.println(avg);

		System.out.println(
				"---------------------------12.List down the names of all employees in each department--------------------------------");

		/*
		 * Map<String, List<Employee>> employeelistByDepartment = employeeList.stream()
		 * .collect(Collectors.groupingBy(e -> e.getDepartment())); Set<Entry<String,
		 * List<Employee>>> entrySet = employeelistByDepartment.entrySet();
		 * 
		 * for (Entry<String, List<Employee>> entry : entrySet) { System.out.println(
		 * "-------------------------------------------------------------------------");
		 * 
		 * System.out.println("Employee In " + entry.getKey() + ":");
		 * 
		 * System.out.println(
		 * "-------------------------------------------------------------------------");
		 * List<Employee> value = entry.getValue(); for (Employee v : value) {
		 * System.out.println(v.getName());
		 * 
		 * } }
		 */
		Set<Entry<String, List<Employee>>> set = employeeList.stream()
				  .collect(Collectors.groupingBy(e -> e.getDepartment())).entrySet();
		for (Entry<String, List<Employee>> entry : set) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Employee In " + entry.getKey() + ":");
			System.out.println("--------------------------------------------");
			List<Employee> value = entry.getValue();
			for (Employee v : value) {
				  System.out.println(v.getName());
				  
				  } 
			
		}
		
		System.out.println("---------------13.What is the average salary and total salary of the whole organization----------------------");
		
		Double col = employeeList.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
		System.out.println("Avg salary "+col);
		
		Double totalsalary = employeeList.stream().collect(Collectors.summingDouble(e->e.getSalary()));
		System.out.println(" Total Salary "+totalsalary);
		
		System.out.println("----------14.Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years---------");
		
		employeeList.stream().filter(e->e.age<=25).forEach(e->System.out.println(e));
		
		System.out.println("----------15.Who is the oldest employee in the organization----------------");
		
		Optional<Employee> oldEmp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getAge())));
		System.out.println(oldEmp);
		
		
		
		

	}
}