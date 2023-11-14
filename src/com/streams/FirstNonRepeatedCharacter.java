package com.streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		  String input="Java articles are Awesome"; 
		  Character result = input.chars().//Stream of String
		  mapToObj(s->Character.toLowerCase(Character.valueOf((char)s))).
		  collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
		  Collectors.counting())).
		  entrySet(). 
		  stream().
		  filter(entry->entry.getValue()==1L).
		  map(entry->entry.getKey()). 
		  findFirst().
		  get();
		  
		  System.out.println(result);
		 
		/*
		 * String name="Chandu"; IntStream s = name.chars();
		 * s.forEach(e->System.out.println(e));
		 */
	
	}

}
