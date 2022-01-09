package lambda_functional_programming;

import java.util.stream.IntStream;

public class FpDt04 {

	public static void main(String[] args) {
		
		System.out.println(getSumFromSevenToHundred01());
		System.out.println(getSumFromSevenToHundred02());
		System.out.println(getMultiplicationFromTwoToEleven());
		System.out.println(calculateFactorial02(5).toString());
		System.out.println(sumOfIntegersInGivenRange(11, 100));
		System.out.println(findSumOfDigitsForTheIntegersInTheGivenRange(23,32));
	}
	//1)Create a method to find the sum of integers from 7 to 100
	//1.way
	public static int getSumFromSevenToHundred01() {
		
		return IntStream.range(7,101).reduce(0,Math::addExact);
		
	}
	//2.way
		public static int getSumFromSevenToHundred02() {
			return IntStream.rangeClosed(7, 100).reduce(0,Math::addExact);
			
		}
		//2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
		public static int getMultiplicationFromTwoToEleven() {
			return IntStream.rangeClosed(2, 11).reduce(1,Math::multiplyExact);
			
		}
		//3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
//		public static int calculateFactorial01(int x) {
//			if(x>0) {
//				return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
//			}
//			System.out.println("Do not use negative numbers in factorial operations");
//			return 0;
//		}cunku tercih edilmez uzun ve okunabilir degil
		public static Object calculateFactorial02(int x) {
				return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact):"Do not use negative numbers in factorial operations";
			
		}
		//4)Create a method to calculate the sum of even integers between given two integers
		public static int sumOfIntegersInGivenRange(int s, int e) {
			int x =0;
			if(s>e) {
				x=s;
				s=e;
				e=x;
			}
			return IntStream.rangeClosed(s, e).filter(UtilsDt::checkToBeEven).sum();
		}
		//5)Create a method to calculate the sum of digits of every integers between given two integers
		//23 and 32 ==> 2+3 + 2+4 +  2+5 + 2+6 + 2+7 + 2+8 + 2+9 + 3+0  + 3+1 + 3+2
		public static int findSumOfDigitsForTheIntegersInTheGivenRange(int s, int e) {
			int x =0;
			if(s>e) {
				x=s;
				s=e;
				e=x;
			}
			return IntStream.rangeClosed(s, e).map(UtilsDt::getSumOfDigits).sum();
		}
		
		
		
}

