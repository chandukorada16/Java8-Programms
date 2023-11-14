package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatedStreams {

	public static void main(String[] args) {
//		Stream<Integer> stream = Stream.of(5,4,6,3,1,2);
//		stream.forEach(line->System.out.println(line));
		List<String> list=new ArrayList<>();
		list.add("Chandu");
		list.add("is");
		list.add("Developer");
		list.add("Now");
		list.stream().forEach(lis->System.out.println(lis));
	
		
		
//		List<Integer> line=Arrays.asList(5,4,6,3,1,2);
//		line.stream().forEach(li->System.out.println(li));
		

	}

}
