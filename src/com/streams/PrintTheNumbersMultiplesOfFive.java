package com.streams;

import java.util.Arrays;
import java.util.List;

public class PrintTheNumbersMultiplesOfFive {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		num.stream().filter(i->i%5==0).forEach(d->System.out.println(d));
	}

}
