package HOMEWORK;

import java.util.ArrayList;
import java.util.List;

public class fp001 {

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
        
        printElementsFunctional(l);
        System.out.println();
        printEvenElements(l);
        System.out.println();
        printOddElements(l);
        System.out.println();
        printEvenCubeElements(l);
        System.out.println();
        printSumOfSquaresOfDistinctOddElements(l);
        printProductOfCubeOfDistinctEvenElements(l);
        printMaxValue(l);
        printMinElement(l);
	}
	//1)Create a method to print the list elements on the console in the same line with a space 
	//  between two consecutive elements.(Functional)

	public static void printElementsFunctional(List<Integer>list) {
		list.stream().forEach(t-> System.out.print(t+ " "));
	}
	//2)Create a method to print the even list elements on the console in the same line with a space 
	//  between two consecutive elements.(Functional)
	public static void printEvenElements(List<Integer>list) {
		list.stream().filter(t->t%2==0).forEach(t->System.out.print(t + " "));
	}
	//3)Create a method to print the square of odd list elements on the console in the same line with a 
	//  space between two consecutive elements.(Functional)
	public static void printOddElements(List<Integer>list) {
		list.stream().filter(o->o%2!=0).map(o->o*o).forEach(o->System.out.print(o+" "));
	}
	//4)Create a method to print the cube of distinct even list elements on the console in the same line 
	//  with a space between two consecutive elements.
	public static void  printEvenCubeElements (List<Integer>list) {
		list.stream().filter(t->t%2==0).map(t->t*t*t).forEach(t->System.out.print(t+" "));
	}
	//5)Create a method to calculate the sum of the squares of distinct Odd elements
	public static void  printSumOfSquaresOfDistinctOddElements(List<Integer>list) {
		Integer sum = list.stream().distinct().filter(t->t%2!=0).map(t->t*t).reduce(0, (t, u)->t+u);
		System.out.println(sum);
	}
	//6)Create a method to calculate the product of the cubes of distinct even elements
	public static void printProductOfCubeOfDistinctEvenElements(List<Integer>list) {
		Integer product = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
		System.out.println(product);
	}
	//7)Create a method to find the maximum value from the list elements
	public static void printMaxValue(List<Integer>list) {
		Integer maxElement = list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
		System.out.println(maxElement);
	}
	//8)Create a method to find the minimum value from the list elements(In 2 ways)
	public static void printMinElement(List<Integer>list) {
		Integer minElement = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)->u);
		System.out.println(minElement);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
;