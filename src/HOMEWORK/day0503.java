package HOMEWORK;

import java.util.Scanner;

public class day0503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the hours");
		long hours = scan.nextLong();
		
		System.out.println("Please enter your full name");
		String fullName = scan.nextLine();
		System.out.println("Enter your adresses");
		String adresses = scan.nextLine();
		
		System.out.println("your full name is: " +(fullName));
		System.out.println("The second: " +(hours*60*60));
		
		
		
	}

}
