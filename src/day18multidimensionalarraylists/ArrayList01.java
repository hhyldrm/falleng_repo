package day18multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		//Disadvantage of Array is that the length must be declared at the beginning
		// and can not be changed. If the length is 100, you can not add 101st element more than 100 elements
		// ArrayList 1) The length of ArrayList is "flexible"
		//			 2) Arraylist can store only non-primitive data-types
		
		//How to declare AraryList
		//1st way
		ArrayList<Integer> list1 = new ArrayList<>();
		
		//2nd way
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		//3rd way recommended
		List<Integer> list3 = new ArrayList<>();
		System.out.println(list3);//[]
		
		//How to add elements
		//The order of elements is the order of insertion
		list3.add(100);
		list3.add(8);
		list3.add(5);
		list3.add(3);
		System.out.println(list3);//[8, 5, 3]
		
		//How to add an element in a specific index
		list3.add(1,10);
		System.out.println(list3);//[8, 10, 5, 3]
		System.out.println(list3.add(20));
		System.out.println(list3);
	
		//How to get the length of list
		System.out.println(list3.size());
		
		//How to check a list is empty
		System.out.println(list3.isEmpty());//false
		System.out.println(list1.isEmpty());//true
		
		//How to check if there is a specific element
		System.out.println(list3.contains(100));//true
		System.out.println(list3.contains(0));//false
		
		//How to remove a specific element from list
		System.out.println(list3.remove(0));//8 it turns the removed element
		
		list3.remove(1);
		System.out.println(list3);
		
		List<String>list4 = new ArrayList<>();
		list4.add("Ali Can");
		list4.add("Veli Han");
		list4.add("Kemal Efe");
		System.out.println(list4);//[Ali Can, Veli Han, Kemal Efe]
		
		list4.remove(0);
		System.out.println(list4);
		list4.remove("Veli Han");
		System.out.println(list4);
		
		
		
	}

}
