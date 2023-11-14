package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseLetters {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("chandu","harsha","karthik","naveen");
		List<String> uppercase = names.stream().map(upper->upper.toUpperCase())
//		.forEach(upper->System.out.println(upper));
		.collect(Collectors.toList());
		
		System.out.println(names);
		System.out.println("Uppercase letters "+uppercase);
		

	}

}
