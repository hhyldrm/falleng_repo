package day06nestedternaryswitchstringmanipulatio;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*type java code by using nested ternary.
		Write a program to check if a year is leap year or not.
		If the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year...");
		int year =scan.nextInt();
		
		String result = (year%100==0) ? ( (year%400==0) ? ("Leap year") : ("Not Leap year")) : ( (year%4==0) ? ("Leap year" ) : ("Not Leap year"));
		System.out.println(year + " is a "+ result);
		
		scan.close();
	}

}
