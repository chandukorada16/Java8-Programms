package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoined {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("A","bbb","CC");
		String joined=words.stream()
				.map(String::toUpperCase)
				.collect(Collectors.joining("-","(",")"));
		System.out.println(joined);
	}


}
