package ifwork;

import java.util.Scanner;

public class ifelse01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your salary");
		int slry = scan.nextInt();
		
		if(slry>=80000) {
			System.out.println("I accept the offer");
		}else if(slry>60000 && slry<80000) {
			System.out.println("I negotiate to increase");
		}else {
			System.out.println("I do not accept the offer");
		}
		scan.close();
				
	}

}
