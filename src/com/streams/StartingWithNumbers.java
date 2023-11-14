package com.streams;

import java.util.Arrays;
import java.util.List;

public class StartingWithNumbers {

	public static void main(String[] args) {

		
		  List<Integer> list=Arrays.asList(10,15,8,49,25,98,32,19);
		  list.stream().map(e->e+"")//convert int to string
		  .filter(e->e.startsWith("1")) .forEach(e->System.out.println(e));
		 
	}

}
