package HOMEWORK;

import java.util.Scanner;

public class lesson05 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a quantity");
	int q = scan.nextInt();
	System.out.println("Enter a unit price");
	int p = scan.nextInt();
	System.out.println("total=" +p*q);
	
	if(p*q >=1000) {
	System.out.println("alacak=" + (p*q-((p*q)/100)*10));
	}else {
		System.out.println("indirim yok");
	}
	
	

	}

}
