package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
	// Check if 2 arrays are same or not

		int arr1[]= {5,12,32,11};
		int arr2[]= {5,12,13};
		// I type my code to check if the arrays are some or not
		int counter=0;
		
		if(arr1.length == arr2.length) {
		
		for(int i =0; i<arr1.length; i++) {
			
			if(arr1[i]!=arr2[i]) {
				counter++;
				break;			
			}
		}
		if (counter ==1) {
			System.out.println("Arrays are not same");
		}else {
			System.out.println("Arrays are same");
		}
		}else {
			System.out.println("Arrays are not same");
		}
		//2.way : There is a build in method in Arrays Class to check i the arrays are some or not
		boolean isSame = Arrays.equals(arr1, arr2);
		if(isSame) {
			System.out.println("Arrays are same");
		}else {
			System.out.println("Arrays are not same");
		}
	}

}
