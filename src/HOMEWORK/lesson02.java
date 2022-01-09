package HOMEWORK;

import java.util.Scanner;

public class lesson02 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a dayname");
		String dayName = scan.next();
		if(dayName=="monday") {
			System.out.print(dayName.substring(3,4));
			
		}else {
			System.out.println("repeat again");
		}

	}

}
