package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> records=str->str.length();
		System.out.println("length of a string "+records.apply("Chandu"));

	}
	

		

}
