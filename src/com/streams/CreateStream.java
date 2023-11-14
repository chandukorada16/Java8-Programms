package com.streams;

import java.util.*;
public class CreateStream {

	public static void main(String[] args) {
		
		/*
		 * //Stream.of Stream<Integer> numbers = Stream.of(9,6,0,3,3,4,5,1,6,9);
		 * numbers.filter(f->f>6).forEach(f->System.out.println(f));
		 * 
		 * //stream() List<String> names=new ArrayList<>(); names.add("Devara");
		 * names.add("Asvr"); names.add("RRR"); names.add("War 2"); names.add("Rogue");
		 * 
		 * Stream<String> stream = names.stream(); Stream<String> map =
		 * stream.filter(name->name.startsWith("R")).map(name->name+"::"+name.length());
		 * map.forEach(m->System.out.println(m));
		 */
		LinkedList al=new LinkedList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add(1,"D");
		System.out.println(al);
	}

	

	
	
	
}
