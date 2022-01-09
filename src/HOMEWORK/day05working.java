package HOMEWORK;

import java.util.Scanner;

public class day05working {

	public static void main(String[] args) {
		/*
		1) write a program to assign a value of 100.235 to a double 
		 variable and then convert it to int. Print it on the console
		 */

		double d1 = 100.235;
		int i1=(int)d1;
		System.out.println(i1);
		
		/*2) Type a program which calculates the cube of a number
		which is entered by user.
		Hint 1: Cube of a number is a x a x a
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sidelength of cube");
		double sideLength = scan.nextDouble();
		System.out.println(sideLength*sideLength*sideLength);
		
		scan.close();
		
		
	}

}
