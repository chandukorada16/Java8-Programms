package com.streams;

import java.util.Arrays;
import java.util.List;

public class MobileTest {

	public static void main(String[] args) {
		Mobile m1=new Mobile("Chandu","oneplus",35000.00,"1Plus");
		Mobile m2=new Mobile("harsha","samsung",14550.00,"samsu");
		Mobile m3=new Mobile("manikamta","lenova", 45000.00, "leno");
		
		List<Mobile> mobiles=Arrays.asList(m1,m2,m3);
		mobiles.stream().filter(i->i.mobile_Price>15000.00).forEach(i->System.out.println(i));
	}

}
