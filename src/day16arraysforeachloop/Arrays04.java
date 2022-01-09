package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
	//Type code to find the number of words in a String
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String...");
		String s = scan.nextLine();
		
		//How split a String by using any character
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words));//[Ali, Can, went, to, school]
		System.out.println("The number of words: " + words.length);
		
		//Count how many words stars with "a"
		int count = 0;
		
		for(int i=0; i<words.length; i++) {
			
			if(words[i].startsWith("a")) {
				System.out.print(words[i] + " ");
				count++;	
			}
		}
		System.out.println("The number of words start with a: " + count);
	}

}
