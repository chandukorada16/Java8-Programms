package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<Integer> even = Arrays.asList(2,4,6);
		List<Integer> odd = Arrays.asList(3,5,7);
		List<Integer> prime = Arrays.asList(2,3,5,7,11);
		
		/*
		 * List<List<Integer>> numbers = Arrays.asList(even,odd,prime); List<Integer>
		 * collect = numbers.stream() .flatMap(list->list.stream()) .sorted()
		 * .collect(Collectors.toList()); System.out.println(collect);
		 */
		List<Integer> collect=Stream.of(even,odd,prime)
				.flatMap(list->list.stream())
				.sorted()
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
