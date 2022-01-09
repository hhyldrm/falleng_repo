package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
	//If it rains, no picnic tomorrow
	//if (it rains) {no picnin tomorrow} in java
	//if condition if body
	//If condition
		
	//1.Example: GEt a numberfrom user. If the number is even, print "Even" on the console
		
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter an integer");
	int num1=scan.nextInt();
	System.out.println("Enter the second number");
	int num2=scan.nextInt();
	
	
	if(num1%2==0) {
		System.out.println("Even");
		
	}

	//2.Example: GEt a number from user. If the number is odd, print "Odd" on the console
	if(num1%2 !=0)
	{
		System.out.println("Odd");
	}
	//Get two number from user.
	if (num1-num2 == 0);
	{System.out.println("The numbers are equal");

	
 } 
	
 scan.close();
}
}
