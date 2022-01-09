package day28exceptions;

import day28exceptions.Exception03.IllegalPointException;

public class Exception03 {
	/*
	The exceptions that we create are called “Custom Exceptions”.
	Points must be between 0-100 inclusively. Create a Custom Exception “IllegalPointException”
 	which will be thrown if point is less than 0 or greater than 100.
	 */

	public static void main(String[] args) throws IllegalPointException {
	checkPoint(-40);

	}
	static class IllegalPointException extends Exception{
		public IllegalPointException(String message) {
			super(message);
		}
	}
	
	public static void checkPoint(int point) throws IllegalPointException {
		if(point<0 || point>100) {
			throw new IllegalPointException(point + "is not bettween 0- 100...");
			
			
		}
		System.out.println("your point is: " + point);
	}
	
	

}
