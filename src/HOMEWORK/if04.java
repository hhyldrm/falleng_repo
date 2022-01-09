package HOMEWORK;

import java.util.Scanner;

public class if04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		String letter = scan.next();
		if(letter =="[a-zA-Z]") {
			System.out.println("there is in alphabet");
		}else
			System.out.println("The cahracter is odd");
	}

}
