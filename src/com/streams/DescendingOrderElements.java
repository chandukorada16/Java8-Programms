package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescendingOrderElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
//		list.stream().sorted(Collections.reverseOrder()).forEach(s->System.out.println(s));
	}

}
