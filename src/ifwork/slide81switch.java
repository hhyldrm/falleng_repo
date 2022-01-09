package ifwork;

import java.util.Scanner;

public class slide81switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one of the 'U', 'S','A' ");
		String str = scan.next().toLowerCase();
		
		switch(str) {
		case "u" :
			System.out.println("United");
			break;
		case "s" :
			System.out.println("States");
			break;
		case "a" :
			System.out.println("Amesrica");
			break;
			default:
				System.out.println("only u,s,a");
		}		
			
		
			
		
		

	}

}
