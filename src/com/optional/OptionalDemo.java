package com.optional;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		String[] str=new String[6];
		str[2]="NTR";
		Optional<String> check = Optional.ofNullable(str[2]);
		if(check.isPresent()) {
			String lowerCase = str[2].toLowerCase();
			System.out.println(lowerCase);
		}else {
			System.out.println("String Value is Not Present");
		}
		
	}

}
