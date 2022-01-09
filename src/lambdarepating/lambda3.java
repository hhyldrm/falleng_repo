package lambdarepating;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class lambda3 {
	 public static void main(String[] args) {
		 List<String> l = new ArrayList<>();
	        l.add("Ali");
	        l.add("Ali");
	        l.add("Mark");
	        l.add("Amanda");
	        l.add("Christopher");
	        l.add("Jackson");
	        l.add("Mariano");
	        l.add("Alberto");
	        l.add("Tucker");
	        l.add("Benjamin");
	        
	        printListToUpperCase(l);
	        System.out.println();
	        printOrderingLength(l);
	        System.out.println();
	        printSortLastCharacter(l);
	        System.out.println();
	        printSortFirstCharacter(l);
	        System.out.println();
	        System.out.println(printCheckLessThan12(l));
	}
	//1) Create a method to print all list elements in uppercase
		//1.Way:
	 public static void printListToUpperCase (List<String>list) {
		 list.stream().map(String::toUpperCase).forEach(Util::printInTheSameLineWithSpace);
	 }
	//2) Create a method to print the elements after ordering according to their lengths
	 public static void printOrderingLength (List<String>list) {
		 list.stream().distinct().sorted(Comparator.comparing(String::length)).forEach(Util::printInTheSameLineWithSpace);	
	}
	//4) Create a method to sort the distinct elements by using their last characters
	 public static void printSortLastCharacter (List<String>list) {
		 list.stream().distinct().sorted(Comparator.comparing(Util ::getLastCahr)).forEach(Util::printInTheSameLineWithSpace);
	 }
	//5) Create a method to sort the elements according to their lengths then according to their first character
	 public static void printSortFirstCharacter (List<String>list) {
		 list.stream().sorted(Comparator.comparing(Util::getFirstChar)).forEach(Util::printInTheSameLineWithSpace);
	 }
	//9) Create a method to check if the lengths of all elements are less than 12
	 public static boolean printCheckLessThan12(List<String>list) {
		 return list.stream().allMatch(t->t.length()<12);
		
	}

}
