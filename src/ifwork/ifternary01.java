package ifwork;

import java.util.Scanner;

public class ifternary01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int i=scan.nextInt();
		
		//System.out.println((i%2==0)?"The integer is even":"The integer is odd");
		
		System.out.println((i<=10)? i*i*i : i*i);
		System.out.println("Enter a String");
		String s = scan.next();
		System.out.println((s.length()==2)?"It is valid" : "It is not valid");
		

	}

}
