package HOMEWORK;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("you enter the initial of the day week");
		int str1 = scan.nextInt();
		System.out.println("Enter a length");
		int str2 = scan.nextInt();
		
		if(str1 == str2) {
			System.out.println("it is square");
	
		}else {
		System.out.println("it is not square");
		}
		

	}

}
