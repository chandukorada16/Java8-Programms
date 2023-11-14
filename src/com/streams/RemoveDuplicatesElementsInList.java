package com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesElementsInList {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(9,6,0,3,3,4,5,1,6,9);
	stream.distinct().forEach(i->System.out.println(i));
	
	
	/*
	 * List<Integer> collect = stream.distinct().collect(Collectors.toList());
	 * System.out.println(collect);
	 */
	}

}
