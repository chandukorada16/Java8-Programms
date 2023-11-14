package com.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterString {

	public static void main(String[] args) {
		String word="{199P5@0115c}  ";
		Map<Character,Long> Charcount=word.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(Charcount);


	}

}
