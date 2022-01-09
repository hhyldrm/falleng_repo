package HOMEWORK;

import java.util.Scanner;

public class day0501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a radius");
		float radius = scan.nextFloat();
		
		System.out.println("The area: "  +(radius*radius)*3.14159);
		System.out.println("the primeter: "+(2*3.14159*radius));
		
		

	}

}
