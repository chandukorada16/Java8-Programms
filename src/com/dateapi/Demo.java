package com.dateapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		
		Date dat=new Date();
		System.out.println(dat);
		
		//To Overcome this problem Java8 Introduced special classes like
		//LocalDate(only date will come)
		//LocalTime(only time will come)
		//LocalDateTime(both date&time will come)
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate of = LocalDate.of(2022, 11, 11);
		System.out.println(of);
		
		date=LocalDate.of(2021, Month.MAY, 20);
		System.out.println(date);
		
		date=LocalDate.parse("2014-12-20");
		System.out.println(date);
		
		date=date.plusDays(4);
		System.out.println(date);
		
		date= date.plusMonths(4);
		System.out.println(date);
		
		date=date.plusYears(2);
		System.out.println(date);
		
		boolean before = LocalDate.parse("2016-05-20").isBefore(LocalDate.parse("2020-11-15"));
		System.out.println(before);
		
		boolean after = LocalDate.parse("2018-11-21").isAfter(LocalDate.parse("2022-10-24"));
		System.out.println(after);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		time=LocalTime.of(12, 12,14);
		System.out.println(time);
		
		time=time.plusHours(10);
		System.out.println(time);
		
		time=LocalTime.parse("08:10:15");
		System.out.println(time);
		
		time=LocalTime.MIN;
		System.out.println(time);
		
		Period ofDays = Period.ofDays(5);
		System.out.println(ofDays.getDays());
		
		Period between = Period.between(LocalDate.parse("2014-12-21"), LocalDate.now());
		System.out.println(between);
		
		LocalDateTime both = LocalDateTime.now();
		System.out.println(both);
		
		Duration between2 = Duration.between(LocalTime.parse("11:05:24"), LocalTime.parse("13:15"));
		System.out.println(between2);
	}

}
