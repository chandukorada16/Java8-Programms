package com.functional;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<String, Integer> filter=(x,y)->{
			return x.length()==y;
		};
		boolean result1 = filter.test("Ashok", 6);
		System.out.println(result1);
		
		boolean result2 = filter.test("Ramu", 5);
		System.out.println(result2);

	}

}
