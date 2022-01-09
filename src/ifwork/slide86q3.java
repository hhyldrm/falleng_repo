package ifwork;

import java.util.Scanner;

public class slide86q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		char d = scan.next().charAt(0);
		
		if(d<'F') {
			System.out.println("Big before F");
			
		}else{
			System.out.println("Big after F");
		}
		if(d<'h') {
			System.out.println("Small before h");
			
		}else {
			System.out.println("Small after h");
		}
	}

}
