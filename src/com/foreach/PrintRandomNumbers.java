package com.foreach;

import java.util.Random;

public class PrintRandomNumbers {

	public static void main(String[] args) {
		Random random=new Random();
		random.ints().limit(10).forEach(numbers->System.out.println(numbers));
	}

}
