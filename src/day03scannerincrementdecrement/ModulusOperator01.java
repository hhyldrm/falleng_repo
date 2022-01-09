package day03scannerincrementdecrement;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		/*we use modulus operator if we want to get the remainder
		 in division operatin
		 *the sign of modulus operatoris %  
		 
		 */
		System.out.println(17%5);//2    17/5 ten kalan
		/*
		 Ask user to enter two integer values; the first one will be greater than the second one.
		The width and the length of a rectangle are found as follows;
		The width is the remainder when the first number divided by the second number.
		The length is the sum of the two numbers.
		Calculate the area and the perimeter of the rectangle.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first integer");
		int bigNum=scan.nextInt();
		System.out.println("enter th second integer smallet than the first integer");
		int smallNum=scan.nextInt();
		
		int width= bigNum % smallNum;
		int length= bigNum + smallNum;
		
		System.out.println("The area is:" + width*length);
		System.out.println("The perimeter is:" + 2*(width+length));
		
				scan.close();
		

	}

}
