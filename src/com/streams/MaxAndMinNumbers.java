package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinNumbers {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	Integer max = list.stream().max(Comparator.naturalOrder()).get();
	System.out.println(max);
	Integer min = list.stream().min(Comparator.naturalOrder()).get();
	System.out.println(min);
	}

}
