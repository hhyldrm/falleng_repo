package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
	//Find the longest word in a String
	public static void main(String[] args) {
		
		String s = "Ali Can went to school to learn";
		
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words));//[Ali, Can, went, to, school, on, January]
		
		Arrays.sort(words, Comparator.comparingInt(String::length)
				);
		System.out.println(Arrays.toString(words));//[to, to, Ali, Can, went, learn, school]
		
		System.out.println(words[words.length-1]);//school
		
		//Get just the year from date in the "mm/dd/yyyy" format
		String date = "10/05/2021";
		String arr[] = date.split("/");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);//2021
				
		//Get the initial of the student names
		String t = "Ali Can, Veli Han, Mary Star went to school by bus";
		String u[] = t.split(", ");//
		System.out.println(Arrays.toString(u));//[Ali Can, Veli Han, Mary Star went to school by bus]
		
		String initials = "";
		for(int i=0; i<u.length; i++) {
			int idx = u[i].indexOf(" ");
			initials = u[i].substring(0,1) + u[i].substring(idx + 1, idx + 2);
			System.out.print(initials + " ");
		}
		
		
	}

}
