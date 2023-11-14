package com.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCountOfEachGivenString {
	
	public static void findCountOfChars(String s) {
		Map<String,Long> stream = Arrays.stream(s.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(str->str,
				LinkedHashMap::new,Collectors.counting()));
		System.out.println(stream);
		
	}

	public static void main(String[] args) {
		CharacterCountOfEachGivenString.findCountOfChars("harsha");
		
		
		
		
		
		

	}

}
