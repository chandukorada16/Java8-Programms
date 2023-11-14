package com.lamda;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		Runnable r=()->System.out.println(Thread.currentThread().MAX_PRIORITY);
		r.run();
	}

}
