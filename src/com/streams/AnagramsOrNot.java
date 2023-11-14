package com.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramsOrNot {

	public static void main(String[] args) {
		String s1="CaRrace";
		String s2="Racecar";
		s1=Stream.of(s1.split("")).map(s->s.toUpperCase()).sorted().collect(Collectors.joining());
		s2=Stream.of(s2.split("")).map(s->s.toUpperCase()).sorted().collect(Collectors.joining());
		if(s1.equals(s2)) {
			System.out.println("Both are Anagrams");
		}else {
			System.out.println("Both are Not anagrams");
		}
		
	}

}
