package day04concatenationifstatement;

public class Concatenation01 {

	public static void main(String[] args) {
		/*
		 If you want to join two or more Strings, use
		 1)"+" sign
		 2)"concat()" method
		 
		 */
			
		String s1= "Ali";
		String s2= "Can";
		System.out.println(s1 + " " + s2);
		System.out.println(s1.concat(" ").concat(s2));
		
		
		int i1=3;
		int i2=4;
		System.out.println(s1+i1+i2);//Ali34
		System.out.println(i1+i2+s1);//7Ali
		System.out.println(s1+(i1+i2));//Ali7
		
		
		
		
	}

}
