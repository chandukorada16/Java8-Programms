package com.functional;

import java.util.function.Predicate;

public class PersonPredicate {
	
	static boolean isPersonEligibleForMembership(Person person,Predicate<Person> predicate) {
		return predicate.test(person);
	}

	public static void main(String[] args) {
		Person person=new Person("chandu", 754);
		Predicate<Person> greaterThanEighteen= (p)->p.age>18;
		
		Predicate<Person> lessThanSixty=(p)->p.age<60;
		
		Predicate<Person> predicate=greaterThanEighteen.or(lessThanSixty);
		
		boolean eligibleForMembership = isPersonEligibleForMembership(person, predicate);
		System.out.println(eligibleForMembership);

	}

}
