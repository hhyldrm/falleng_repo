package HOMEWORK;

import java.util.Scanner;

public class day0502 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter  lengths of triangle");
		byte lengthA = scan.nextByte();
		byte lengthB = scan.nextByte();
		byte lengthC = scan.nextByte();
		
		System.out.println("The triangle pirimeter: " +(lengthA+lengthB+lengthC));

	}

}
