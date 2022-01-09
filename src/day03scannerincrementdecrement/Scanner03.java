package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {

		/*
		 Get the firstname, middle name, last name and SSN from user, then print them like the following;
     Ali Mert Can
     123456789
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your firstname");
		String firstName=scan.next();
		System.out.println("enter your middle name");
		String middleName=scan.next();
		System.out.println("enter your lastname");
		String lastName=scan.next();
		System.out.println("enter your SSN");
		String sSN=scan.next();
		
		System.out.println(firstName+" "+middleName+" "+lastName);
		System.out.println(sSN);
		
		scan.close();
	}

}
