package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EvenNumbersInList {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);
		Stream<Integer> numbers = list.stream().filter(even->even%2==0);
		numbers.forEach(e->System.out.println(e));

	}

}
