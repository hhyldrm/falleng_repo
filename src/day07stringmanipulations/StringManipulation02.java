package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name...");
		String fullName = scan.nextLine();
		
		System.out.println(fullName);
		
		//1)Remove spaces from beginning an end when user entered the name
		String trimmedFullName = fullName.trim();
		System.out.println(trimmedFullName);
		//2)Check if the String is empty String.
		boolean isTheStringEmpty = fullName.isEmpty();
		System.out.println(isTheStringEmpty);
		//3)Check if the String is blank(No character or just space character) String.
		boolean isTheStringBlank = fullName.isBlank();
		System.out.println(isTheStringBlank);
		
		//Check the products if there is any product which has no price.
		
		
	}

}
