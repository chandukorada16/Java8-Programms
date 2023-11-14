package com.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
	
	

	public static void main(String[] args) {
//		List<String> list = Arrays.asList("chandu","Harsha","chandu");
//					
//		list.stream().distinct().forEach(p->System.out.println(p));
//	
	String s2="naVeEn";
			Character result = s2.chars()
			.mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			.entrySet()
			.stream()
			.filter(entry->entry.getValue()>1L)
			.map(entry->entry.getKey())
			.findFirst()
			.get();
			 System.out.println(result);
			

	}

}
