package com.functional;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> p=(s)->s.charAt(1)=='h';
		System.out.println(p.test("Chandu"));
	}

}
