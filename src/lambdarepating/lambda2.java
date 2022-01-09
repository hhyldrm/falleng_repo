package lambdarepating;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        
        printListElement(l);
        System.out.println();
        printEvenList(l);
        System.out.println();
        printSquareOddList(l);
        System.out.println();
        printCubeOfDistinctOdd(l);
        System.out.println();
        printSumSquareOfDistinctEven(l);
        printProductOfCubeOfDistincteven(l);
        printMinValue(l);
        printHalfOfGreaterThan5reverse(l);
	}
	
	//1)Create a method to print the list elements on the console in the same line with a space 
	//  between two consecutive elements.(Functional with method reference)
	public static void printListElement(List<Integer>list) {
		list.stream().forEach(Util::printInTheSameLineWithSpace);
	}
	//2)Create a method to print the even list elements on the console in the same line with a space 
		//  between two consecutive elements.(Functional with method reference)
	public static void printEvenList(List<Integer>list) {
		list.stream().filter(Util::checkToBeEven).forEach(Util::printInTheSameLineWithSpace);
	}
	//3)Create a method to print the square of odd list elements on the console in the same line with a 
	//  space between two consecutive elements.(Functional)
	public static void printSquareOddList(List<Integer>list) {
		list.stream().filter(Util::checkToBeOdd).map(Util::getSquare).forEach(Util::printInTheSameLineWithSpace);
	}
	//4)Create a method to print the cube of distinct odd list elements on the console in the same line 
		//  with a space between two consecutive elements.
	public static void printCubeOfDistinctOdd(List<Integer>list) {
		list.stream().filter(Util::checkToBeOdd).distinct().map(Util::getCube).forEach(Util::printInTheSameLineWithSpace);
	}
	//5)Create a method to calculate the sum of the squares of distinct even elements
	public static void printSumSquareOfDistinctEven (List<Integer>list) {
	Integer sum = list.stream().distinct().filter(Util::checkToBeEven).map(Util::getSquare).reduce(0,Math::addExact);
	System.out.println(sum);
	}
	//6)Create a method to calculate the product of the cubes of distinct even elements
	public static void printProductOfCubeOfDistincteven (List<Integer>list) {
	Integer product = 	list.stream().distinct().filter(Util::checkToBeEven).map(Util::getCube).reduce(1, Math::multiplyExact);
	System.out.println(product);
	}
	//8)Create a method to find the minimum value from the list elements(Method Reference)
	public static void printMinValue(List<Integer>list) {
		Integer minValue = list.
								stream().
								distinct().
								reduce(Integer.MAX_VALUE, Math::min);
		System.out.println(minValue);
	}
	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
	public static void printHalfOfGreaterThan5reverse(List<Integer>list) {
		List<Double> result= list.
								stream().
								distinct().
								filter(t->t>5).
								map(Util::getHalf).
								sorted(Comparator.reverseOrder()).
								collect(Collectors.toList());
		System.out.println(result);
		
	}
	
	
	
	
	
}
