package com.employeessssss;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.streams.Employee;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		list.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		list.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		list.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		list.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		list.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		list.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		list.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		list.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		list.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		list.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		list.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		list.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		list.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		list.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
//		1. How many male and female employees are there in the organization ?
		Map<String,Long> count=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(count);
		
		System.out.println("---------------------------------------------------");
		
//		2. Print the name of all departments in the organization ?
		list.stream().map(Employee::getDepartment).distinct().forEach(i->System.out.println(i));
		
		System.out.println("-----------------------------------------------------");
		
//		3. What is the average age of male and female employees ?
		Map<String, Double> avg = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(avg);
		
		System.out.println("--------------------------------------------");
		
//		4. Get the details of highest paid employee in the organization ?
		Optional<Employee> richEmp = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		if(richEmp.isPresent()) {
			Employee employee = richEmp.get();
			System.out.println(richEmp);
		}
		
		System.out.println("----------------------------------------------");
		
	//	5. Get the names of all employees who have joined after 2015 ?
		list.stream().filter(i->i.yearOfJoining>2015).map(Employee::getName).forEach(i->System.out.println(i));
		
		System.out.println("----------------------------------------------");
		
//		6. Count the number of employees in each department ?
		Map<String,Long> empCount=list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(empCount);
		
		System.out.println("-----------------------------------------------------");
		
//		7. What is the average salary of each department ?
		Map<String,Double> avgSalaryDep=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryDep);
		
		System.out.println("---------------------------------------------------");
		
//		8.Get the details of youngest male employee in the Development department ?
		Optional<Employee> minYoungEmp = list.stream().filter(i->i.getGender().equals("Male") && i.getDepartment().equals("Development"))
		.min(Comparator.comparing(Employee::getAge));
		if(minYoungEmp.isPresent()) {
			Employee employee = minYoungEmp.get();
			System.out.println(employee);
		}
		
		System.out.println("-----------------------------------------");
		
//		9.Who has the most working experience in the organization ?
		Optional<Employee> mwe = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println(mwe);
		
		System.out.println("-------------------------------------------------");
		

//   10. How many male and female employees are there in the Sales team ?
		Map<String, Long> smf = list.stream().filter(i->i.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(smf);
		
		System.out.println("--------------------------------------------------------");
		

//		11.  What is the average salary of male and female employees ?
		Map<String, Double> avgMF = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgMF);
		
		System.out.println("-----------------------------------------------");
		
//		12.List down the names of all employees in each department ?
		Set<Entry<String, List<Employee>>> set = list.stream()
				  .collect(Collectors.groupingBy(e -> e.getDepartment())).entrySet();
		for (Entry<String, List<Employee>> entry : set) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Employee In " + entry.getKey() + ":");
			System.out.println("--------------------------------------------");
			List<Employee> value = entry.getValue();
			for (Employee v : value) {
				  System.out.println(v.getName());
				  
				  }
			
			System.out.println("------------------------------------------");
			
//		13.What is the average salary and total salary of the whole organization ?
			DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
			System.out.println(" avg salary "+statistics.getAverage());
			System.out.println(" total salary "+statistics.getSum());
			
			System.out.println("---------------------------------------------------");

//       14.Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?
			Map<Boolean, List<Employee>> partitionEmployeesByAge=
	                list.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

			Set<Map.Entry<Boolean, List<Employee>>> cheppanu = partitionEmployeesByAge.entrySet();

			for (Map.Entry<Boolean, List<Employee>> entriii : cheppanu) {
				System.out.println("----------------------------");

				if (entriii.getKey()) {
					System.out.println("Employees older than 25 years :");
				}
				else {
					System.out.println("Employees younger than or equal to 25 years :");
				}

				System.out.println("----------------------------");

				List<Employee> lists = entriii.getValue();

				for (Employee e : lists) {
					System.out.println(e);
				}
			}
			System.out.println("-------------------------------------------------");
			
		}
		
		System.out.println("---------------------------------------");
		

//		15.  Who is the oldest employee in the organization?
		Optional<Employee> min=list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println(min);
	}
	


}




