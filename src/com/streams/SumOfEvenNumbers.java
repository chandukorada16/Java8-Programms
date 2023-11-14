package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int sum=IntStream.rangeClosed(1, 100).filter(odd->odd%2==1).sum();
		System.out.println(sum);
		
		
		
		
		

	}

}
