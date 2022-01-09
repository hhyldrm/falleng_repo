package lambdarepating;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lambda1 {

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
        
        
        elements(l);
        System.out.println();
        squareofodd(l);
        System.out.println();
        sumofsquareofdistincteven(l);
        System.out.println();
        getminvalue(l);
        System.out.println();
        greaterthan7(l);
        System.out.println();
        greaterThanFiveInReverse(l);
	}
	//1)Create a method to print the list elements on the console in the same line with a space 
		//  between two consecutive elements.(Functional)
	public static void elements(List<Integer> list) {
		list.stream().forEach(t->System.out.print(t+ " "));
	}
	//3)Create a method to print the square of odd list elements on the console in the same line with a 
		//  space between two consecutive elements.(Functional)
	public static void squareofodd(List<Integer> list) {
		list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t + " "));
	}
	//5)Create a method to calculate the sum of the squares of distinct even elements
	public static void sumofsquareofdistincteven(List<Integer> list) {
		Integer sum =list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t,u)->t+u);
		System.out.println(sum);
	}
	//8)Create a method to find the minimum value from the list elements
	
	public static void getminvalue(List<Integer> list) {
       Integer minelement = list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)->t<u ? t : u);
		System.out.println(minelement);
		
	}
	
	

	//9)Create a method to find the minimum value which is greater than 7 and even from the list
	public static void greaterthan7(List<Integer> list) {
		Integer mingreaterthan7 = list.stream().
				distinct().
				filter(t->t%2==0).
				filter(t->t>7).
				sorted().
				findFirst().
				get();
		System.out.println(mingreaterthan7);
	}
	
	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
	public static void greaterThanFiveInReverse(List<Integer> list) {
		List<Double> elements2 = list.stream().
										distinct().
										filter(t->t>5).
										map(t->t/2.0).
										sorted(Comparator.reverseOrder()).
										collect(Collectors.toList());
		System.out.println(elements2);
	}
	
	
	
	
	
	

	
	
}
