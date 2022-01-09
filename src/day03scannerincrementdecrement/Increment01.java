package day03scannerincrementdecrement;

public class Increment01 {

	public static void main(String[] args) {
		/*Incremet is to increase the value of a number variable
		by "+" and "*"
		1st way;
		*/
		
		int num1 = 3;
		num1 = num1+2;
		System.out.println(num1);//5
		num1=num1+10;
		System.out.println(num1);//15
		num1=num1*2;
		System.out.println(num1);//30
		
		//2nd way; warning: dont separate operation sign and equality sign
		num1 += 4;//this is same as num1=num1+4
		System.out.println(num1);
		num1 *= 3;
		System.out.println(num1);
		
		//3rd way is only for increasing by 1
		num1++;
		System.out.println(num1);//103
		
	}

}
