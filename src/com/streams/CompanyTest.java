package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CompanyTest {

	public static void main(String[] args) {
		List<Company> company=new ArrayList<>();
		company.add(new Company(501, "Chandu", 45000.00, "Hyderabad"));
		company.add(new Company(503, "Harsha", 85000.00, "Vizag"));
		company.add(new Company(498, "Kohli", 165000.00, "Hyderabad"));
		company.add(new Company(501, "Abd", 45000.00, "Hyderabad"));
		company.add(new Company(503, "Ms Dhoni", 45000.00, "Ranchi"));
		company.add(new Company(498, "Sachin", 65000.00, "Mumbai"));
		
//1.Maximum Salary
		Optional<Company> max = company.stream().collect(Collectors.maxBy(Comparator.comparing(Company::getSalary)));
		System.out.println(max);
		
		System.out.println("------------------------------");
		
//2.Minimum Salary
		Optional<Company> min = company.stream().collect(Collectors.minBy(Comparator.comparing(Company::getSalary)));
		System.out.println(min);
		
		System.out.println("----------------------------");
		
//3.Iterate Elements
		company.stream().forEach(d->System.out.println(d));
		
		System.out.println("------------------------------------------------------");
		
//4.sorting based on based on id
		company.stream().sorted(Comparator.comparing(Company::getId)).forEach(f->System.out.println(f));
		
		System.out.println("-------------------------------");

//5.sorted based on salary
		company.stream().sorted(Comparator.comparing(Company::getSalary)).forEach(f->System.out.println(f));
		
		System.out.println("-----------------------------------------------------");
		
//6.
		Map<String, List<Company>> collect = company.stream().collect(Collectors.groupingBy(Company::getName));
		System.out.println(collect);
		
		
		

	}

}
