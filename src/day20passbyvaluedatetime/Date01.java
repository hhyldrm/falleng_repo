package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
	
		System.out.println(LocalDate.now());//2021-10-29
		System.out.println(LocalTime.now());//19:28:30.526196500
		System.out.println(LocalDateTime.now());//2021-10-29T19:30:20.422702
		
		//How to manipulate date
		LocalDate currentDate = LocalDate.now();
		currentDate = currentDate.plusDays(7);
		System.out.println("The date after 7 days: " + currentDate);//2021-11-05
		
		currentDate= currentDate.minusDays(3);
		System.out.println("3 days before: " + currentDate);//2021-11-02
		
		currentDate = currentDate.plusMonths(6);
		System.out.println("After 6 months: " + currentDate);
		
		currentDate = currentDate.plusYears(4).minusMonths(3).plusDays(17);
		System.out.println("After the method chain: " + currentDate);//2026-02-19
		
		LocalDate dob =currentDate.of(2000, 11, 23);
		System.out.println(dob);//200-11-23
		
		System.out.println(currentDate.MAX);//+999999999-12-31
		
		System.out.println(currentDate.EPOCH);//1970-01-01(The date computers start to measure system time)
		
		//How to manipulate time
		LocalTime currentTime = LocalTime.now();
		int hour= currentTime.getHour();
		System.out.println(hour);//19
		
		//print the time 20.30
		
		LocalTime time = currentTime.of(21, 20);
		System.out.println(time);//21:20
		
		boolean isAfter = currentTime.isAfter(time);
		System.out.println(isAfter);//false
		
		System.out.println(currentTime.MIDNIGHT);//00;00
		System.out.println(currentTime.NOON);//12:00
		System.out.println(currentTime.MAX);//23:59:59.999999999
		System.out.println(currentTime.MIN);//00:00
		
		
		
		
		
		
		
		
		
		
		

	}

}
