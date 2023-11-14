package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumMinimumThree {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println("-------min 3 numbers---");
		list.stream().sorted().limit(3).forEach(n->System.out.println(n));
		
		System.out.println("------max 3 numbers-----");
		
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(n->System.out.println(n));
		
	}

}
