package day28exceptions;

public class Exception01 {

	public static void main(String[] args) {
		Object obj = 5;
		convert(obj);
		
		String s1 = "1234";
		convertStringToInteger(s1);
		
		String s2 = "1a2bc34";
		convertStringToInteger(s2);//NumberFormatException : If a String has some non digit characters, then Jaava throws this exception
		
		String s3 = "";
		convertStringToInteger(s3);
		
	}
	//Create a method to convert an Object class object to String
	public static void convert (Object obj) {
		try {
		String convertedString =(String) obj;
		System.out.println(convertedString);//ClassCastException: If a data type can't be converted to another data type
											// then Java throws this exception
		} catch(ClassCastException e) {
			System.out.println("Some data type can't be converted to some other data type" + e.getMessage());
			
		}
		
	}
	//Create a method to convert String variable to Integer variable
	public static void convertStringToInteger(String str) {
		try {
		int convertedInteger = Integer.parseInt(str);//parseInt() converts Strings toInteger. If a string can be converted to Integer
													// we call it parsable	
		System.out.println(convertedInteger);
		} catch(NumberFormatException e) {
			System.out.println("String has some non-digit characters can't be converted to Integer: " + e.getMessage());
		}
		
		
		
		
	}
	
	
}
