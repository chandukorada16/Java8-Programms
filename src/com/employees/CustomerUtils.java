package com.employees;

import java.util.Arrays;
import java.util.List;

public class CustomerUtils {
	
	public static List<Customer> getCustomerData(){
		
		Address homeAddress=new Address("6-96", "Ntr Road", "Jangareddigudem");
		
		Address officeAddress=new Address("6-66","sardar-patel road" , "Jntu");
		
		Customer customer1=new Customer(1, "Chandu", "Hyderabad", "chandukorada@gmail.com", 9603345169l, Arrays.asList(homeAddress,officeAddress));
		
		Customer customer2=new Customer(2, "likhita", "lakadikapul", "likhita@gmail.com", 7896568246l, Arrays.asList(homeAddress,officeAddress));
		
		Customer customer3=new Customer(3, "naveen", "Nampalli", "chandukorada@gmail.com", 45698712356l, Arrays.asList(homeAddress,officeAddress));
		
		Customer customer4=new Customer(4, "sankar", "secunderabad", "shankar@gmail.com", 1234567896l, Arrays.asList(homeAddress,officeAddress));
		
		Customer customer5=new Customer(5, "pravallika", "Panjagutta", "pravallika@gmail.com", 9876543210l, Arrays.asList(homeAddress,officeAddress));
		
		Customer customer6=new Customer(6, "Karthik", "Kukatpally", "dheerajkartik@gmail.com", 9603345169l, Arrays.asList(homeAddress,officeAddress));
		
		Customer customer7=new Customer(7, "Harsha", "Panjagutta", "harsharangu@gmail.com", 8247596775l, Arrays.asList(homeAddress,officeAddress));
		
		Customer customer8=new Customer(8, "srinivas", "Nampalli", "srinivas@gmail.com", 5236987453l, Arrays.asList(homeAddress,officeAddress));
		
		return Arrays.asList(customer1,customer2,customer3,customer4,customer5,customer6,customer7,customer8);
	}

}
