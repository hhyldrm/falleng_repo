package HOMEWORK;

import java.util.Scanner;

public class lesson03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your password");
		String pass = scan.next();
		if(pass.equals("JavaLearner")) {
			System.out.println("The password is true");
			
		}else {
			System.out.println("The password is false");
		}
		
		

	}

}
