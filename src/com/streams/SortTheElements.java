package com.streams;

import java.util.Arrays;
import java.util.List;

public class SortTheElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		list.stream().sorted().forEach(s->System.out.println(s));

	}

}
