package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=	Arrays.asList(10,15,8,8,49,25,98,98,32,15);
		Set<Integer> set=new HashSet<>();
		list.stream().filter(n->!set.add(n)).forEach(n->System.out.println(n));
		
	}

}
