package ifwork;

import java.util.Scanner;

public class slide86q1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer");
		int i = scan.nextInt();
		
		if(i<10) {
			System.out.println(i*i);
			
		}else if(i>10) {
			System.out.println(i*2);
			
		}else {
			System.out.println(i);
		}
		

	}

}
