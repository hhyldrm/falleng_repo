package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		//Find the closest 2 integers in the given list
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(13);
		list1.add(7);
		list1.add(3);
		list1.add(21);
		list1.add(31);
		list1.add(25);
		System.out.println(list1);//[13, 7, 3, 21, 31, 25]
		
		//To sort a list we use collections.sort()
		Collections.sort(list1);
		System.out.println(list1);//[3, 7, 13, 21, 25, 31]
		
		int minDiff = Integer.MAX_VALUE;
		for(int i =1; i<list1.size();i++) {
			minDiff = Math.min( minDiff , list1.get(i) - list1.get(i-1));
		}
		System.out.println(minDiff);
		 
		for(int i =1; i<list1.size();i++) {
			if(list1.get(i) - list1.get(i-1)== minDiff) {
			System.out.println(list1.get(i) + "and" + list1.get(i-1));
			}
		}
	}
}
