package HOMEWORK;

import java.util.Arrays;
import java.util.HashMap;

public class wordcounter {

	public static void main(String[] args) {
		/*
		   Count the words in a String one by one
			 Girilen bir String’deki kelimeleri tek tek saydiran java code create ediniz.
		​
			 For Example:
			 Input : String is “Ali came to school and Ayse came to school”
			 Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
		 */
		String s = "Ali came to school and Ayse came to school";
		String word [] = s.split(" ");
		System.out.println(Arrays.toString(word));
		
		HashMap<String, Integer> resultMap = new HashMap<>();
		
		for(String w:word) {
			Integer numOfOccurences = resultMap.get(w);
            
            if(numOfOccurences==null) {
                resultMap.put(w, 1);
            }else {
                resultMap.put(w, numOfOccurences+1);
			
		}
           
		}
		 System.out.println(resultMap);
	}

}
