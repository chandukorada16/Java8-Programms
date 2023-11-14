package com.spliterator;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpecialIterator {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Naveen");
		al.add("Hal");
		al.add("Q");
		al.add("Polishetty");
	Spliterator<String> spliterator = al.spliterator();
	
	spliterator.forEachRemaining(System.out::println);

	}

}
