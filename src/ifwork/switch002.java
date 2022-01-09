package ifwork;

import java.util.Scanner;

public class switch002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
			default:
				System.out.println("Not allowed");
		
		
		
		}

	}

}
