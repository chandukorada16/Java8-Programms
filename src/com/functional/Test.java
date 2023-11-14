package com.functional;

class Parent {
	public void m1(int x) {
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	public void m1(int... x) {
		System.out.println("Child method");
	}
}

public class Test {

	public static void main(String[] args) {
		 Parent p=new Parent();
		 Child c=new Child();
	 	Parent p1 = new Child();
		p.m1(10);
		c.m1();
		c.m1(10);
		c.m1(10, 20);
		p1.m1(10);

	}


}
