package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
	
	//Check if a specific element exists in an array
	public static void main(String[] args) {
	
		int arr[] = {112,21,34};
		
		//1 way:
		int expectedElement = 35;
		int counter = 0;
		
		for(int i = 0 ; i<arr.length;i++) {
			if(expectedElement == arr[i]) {
				counter++;
				break;
			}
		}
		if(counter==1) {
			System.out.println(expectedElement + " exists in the array.");
		}else {
			System.out.println(expectedElement + " does not exist in the array.");
		}
		//2. Way:
		//binarySearch() returns the index of the expected element if the element exists
		//binarySearch() returns negative integers for non=existing element. The value represents the order number
		// if the element exists
		//Before using binarySearch() method you have to use sort() otherwise the output you got does not have
		// ant meaning
		//binarySearch() does not give stable outputs for repeated values
		Arrays.sort(arr);
		System.out.println("Binary Searh Result: " + Arrays.binarySearch(arr, expectedElement));//-4
			
	}

}
