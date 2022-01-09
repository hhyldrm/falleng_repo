package day05nestedifternary;

public class Ternary01 {

	public static void main(String[] args) {
		/*
		 If an integer is positive print "The integer is positive"
		  otherwise print "The integer is not positive"
		 */
		int num=10;
		int num7=-5;
		if(num>0) {System.out.println("Integer is positive");}else {System.out.println("The intger is not positive");}
		if(num7>0) {System.out.println("Integer is positive");}else {System.out.println("The intger is not positive");}
		
		//2nd using ternary
		String result= num>0   ?     "The integer is positive"		: "The integer is not positive";
		System.out.println(result);
		int y = 11;
		int z =  11;
		int resultw =y<10 ? y++ : z++;
		System.out.println(resultw +","+y+","+z);
		
		//Write a program to print the minimum of 2 integers on the console. Use ternary..
		
		int num1=10;
		int num2=15;
		
		int min=num1<num2 ? num1:num2;
		System.out.println(min + " is minimum");
		
		//Write a program to print absolute value of an integer.
		//
		int num3=-10;
		
		int abs=num3>=0 ? num3 : -1*num3;
				System.out.println(abs);
				
		
	}
	

}
