package HOMEWORK;

import java.util.Scanner;

public class if01 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		
		
		if(num1%5==0) {
			System.out.println("5 ile tam bolunebilir bir sayi sectiniz.");
			
			
		}else {
			System.out.println("Tekrar giriniz");
		}
scan.close();
	}

}
