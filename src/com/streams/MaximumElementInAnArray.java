package com.streams;

import java.util.Arrays;

public class MaximumElementInAnArray {
	
	public static int findMaxElement(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}

	public static void main(String[] args) {
		int arr[]= {12,19,20,88,100,9};
		System.out.println(MaximumElementInAnArray.findMaxElement(arr));


	}

}
