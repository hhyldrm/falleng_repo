package day07stringmanipulations;

public class StringManipulation01 {
	
	/*
	 	Regex(Regular Expression): Regex is used to declare a group of characters
	 	i) All lower case letters ==> [a-z]
	 	ii)All upper case letters ==> [A-Z]
	 	iii)All upper case and lower case letters ==> [a-zA-Z]
	 	iv)All characters different from space character ==> \\S
	 	v) Space character ==> \\s
	 	vi) All characters different from digits ==>\\D
	 	vii)All digits ==>\\d
	 	viii)Non alphabetical charactes ==>"[^a-zA-Z]"
	 	ix)Characters from a to z, from A to Z, from 0 to 9, and
	 	Characters different from a to z, from A to Z, from 0 to 9, and
	 */

	public static void main(String[] args) {
	
		//1)Type code to find the number of space characters in a String
		String s1 = "Ali1 went2 to3 the school.";		
		String updateds1 = s1.replaceAll("\\S", "");
//		System.out.println(updateds1.length());
		
		//2)Type code to find the number of characters different from space character
		
		//1.Way:                Number of all characters - Number of space characters = Number of characters different from space character
		int numfCharsDiffFromSpace =  s1.length()        -      updateds1.length();
		System.out.println(numfCharsDiffFromSpace);
		
		//2.Way: Find the characters different from space directly
		String updated2s1 = s1.replaceAll("\\s", "");//Ali1went2to3theschool.
		System.out.println(updated2s1.length());
		
		//3)Type code to find the number of digits, number of letters, and characters different from digits and numbers.
		String s2 = "Ali Can: 1234567890 !!! ? .";
		
		String updates2 = s2.replaceAll("\\D", "");//"\\D" and [0-9] have same meaning
		System.out.println(updates2.length());//10
		
		String updated2s2 = s2.replaceAll("[^a-zA-Z]", "");
		System.out.println(updated2s2.length());//6
		System.out.println(updated2s2);// AliCan
		
		String updated3s2 = s2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(updated3s2);
		System.out.println(updated3s2.length());//16
		
		
		/*
		 * 
		 */
		
		String pwd = "123Abc";
		boolean isFirstCharSpace = pwd.startsWith("");
		System.out.println(isFirstCharSpace);
		
		boolean isLastCharSpace = pwd.startsWith("");
		System.out.println(isLastCharSpace);
		
		int numOfDigitChars = pwd.replaceAll("\\D", "").length();
		System.out.println(numOfDigitChars);
		int numOfLowerCaseChars = pwd.replaceAll("[^a-z]", pwd).length();
		System.out.println(numOfLowerCaseChars);
		int numOfUpperCaseChars = pwd.replaceAll("[^A-Z]", pwd).length();
		System.out.println(numOfUpperCaseChars);
		int numOfCharsDiffFromLetterAndDigit = pwd.replaceAll("[^a-zA-Z0-9]", pwd).length();
		System.out.println(numOfCharsDiffFromLetterAndDigit);
		
		
		if (isFirstCharSpace) {
			System.out.println("Your password is invalid. Do not use space at the beginning.");
			
		}
		if(isLastCharSpace) {
			System.out.println("Your password is invalid. Do not use space at the end.");
			
		}
		if(numOfDigitChars==0) {
			System.out.println("Your password is invalid.  use at space at least 1 digit.");
		}
		if(numOfLowerCaseChars==0) {
			System.out.println("Your password is invalid.  use at space at least 1 lowercase letter.");
		}
		if(numOfUpperCaseChars==0) {
				System.out.println("Your password is invalid.  use at space at least 1 uppercase letter.");
		}
		if(numOfCharsDiffFromLetterAndDigit==0) {
					System.out.println("Your password is invalid.  use at space at least 1 digit.");
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}