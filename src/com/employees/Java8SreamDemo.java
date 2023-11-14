package com.employees;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import javax.tools.DocumentationTool.Location;

public class Java8SreamDemo {

	public static void main(String[] args) {
		List<Customer> customerList=CustomerUtils.getCustomerData();
//		System.out.println(customerList);
		
		/*Before Java8
		 * Iterator<Customer> iterator = customerList.iterator();
		 * while(iterator.hasNext()) { System.out.println(iterator.next()); }
		 */
		/*After Java8
		 * customerList.stream() .forEach(list->System.out.println(list));
		 */
		/*
		 * using filter method List<String> list =
		 * Arrays.asList("mahesh","Ramu","suresh","Ntr","shivashankar","Naveen");
		 * list.stream().filter(names->names.length()<=5).forEach(names->System.out.
		 * println(names));
		 */
		/*
		 * nampally location employyes filter
		 * customerList.stream().filter(loc->loc.getLocation().equals("Nampalli")).
		 * forEach(loc->System.out.println(loc));
		 */
		/*
		 * using map() method List<Character> list =
		 * Arrays.asList('a','b','c','d','e','z');
		 * list.stream().map(nu->nu.toUpperCase(nu)).forEach(nu->System.out.print(nu+" "
		 * ));
		 */
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().map(square->Math.random()).forEach(square->System.out.println(square));
	}

}
