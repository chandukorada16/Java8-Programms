package com.functional;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consumer1=(arg)->System.out.println(arg+" My name is Chandu");
		
		Consumer<String> consumer2=(arg)->System.out.println(arg+" My name is Surya");
		
		consumer1.andThen(consumer2).accept("Hello");

	}

}
