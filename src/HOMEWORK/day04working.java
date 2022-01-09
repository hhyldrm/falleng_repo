package HOMEWORK;

import java.util.Scanner;

public class day04working {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a born year");
		String year = scan.next().toLowerCase();
		
		if  (year.equals("1986"))
			{ 
			System.out.println("happy birthday hasan");
			}else if (year.equals("1991")) {
				
		
		System.out.println("happy birthday nuran");
			}else {
				System.out.println("degistir");
			}

	}

}
