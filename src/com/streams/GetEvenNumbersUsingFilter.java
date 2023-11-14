package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GetEvenNumbersUsingFilter {

	public static void main(String[] args) {
		List<Integer> evenNumbers=Arrays.asList(11,12,13,14,15,16,17);
		evenNumbers.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		
	}

}
