package ifwork;

import java.util.Scanner;

public class nestedif01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if (num%2==0) {
			if(num%3==0) {
				System.out.println("Perfect even number");
			}else {
				System.out.println("good even number");
			}
		}else if(num%2!=0) {
			if(num%3==0) {
				System.out.println("Perfect odd number");
			}else {
				System.out.println("good odd number");
		}
		}
	}

}
