package ifwork;

import java.util.Scanner;

public class slide8602 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter his kid's name");
		String str = scan.next().toLowerCase();
		
		if(str.contains("a")) {
			System.out.println("This name contains 'a'");
			
		}else if(str.contains("z")) {
			System.out.println("This name contains 'z'");
		}else {
			System.out.println("This name contains neither 'a' nor 'z'");
		}
		scan.close();
	}
	

}
