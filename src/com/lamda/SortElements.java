package com.lamda;

import java.util.ArrayList;
import java.util.Collections;


public class SortElements {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(54);
		al.add(87);
		al.add(87);
		al.add(65);
		al.add(24);
		al.add(35);
		
		Collections.sort(al,(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0);
		
		System.out.println(al);
	}

}
