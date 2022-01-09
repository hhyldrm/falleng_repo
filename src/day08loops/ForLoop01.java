package day08loops;

public class ForLoop01 {

	public static void main(String[] args) {
		//Type code to print "Hello!" on 3 different lines
		//1st way: not recommended
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		//2nd way
		//We use loops for repeating tasks
		//The loops are 1) for-loop 2)while-loop 3) do-while-loop 4) for-each-loop
		
		System.out.println("======================");
		
		for(int  i=1; i<4; i++) {
			System.out.print("Hello");
		}
		System.out.println("========================");
		//Type all integers from 11 to 44 in the same line with a space between consecutive integers
		
		for(int i=11 ;  i<45   ; i++    ){
			System.out.print(i + " ");
		}
		
		//Type all even integers from 11 to 120 in the same line with a space between consecutive integers
		//1st way
		for(int i=11;  i<121 ; i++) {
			if(i%2==0) {
				System.out.print(i);
			}
		}
		//2nd
		for(int i=12 ;i<121 ;i=i+2) {
			System.out.print(i);
		}
		System.out.println("==========================");
		//Type all odd integers from 120 to 11 in the same line with a space between consecutive integers	
		
		for(int i = 120 ; i > 10 ; i--) {
				if(i%2!=0) {
					System.out.print(i+ " ");
			}
		}
		System.out.println("====================");
		//Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers
		 for(int i = 120; i  > 10; i--) {         
	            if(i%4==0 && i%6==0) {
	                System.out.print(i+ " ");
	            }           
	        }
		System.out.println("=================================");
		 //Using the String "Java", type "J*a*v*a*" on the console
		 String str = "Java";
		 for(int i=0; i<4;i++) {
			 System.out.print(str.charAt(i)+ "*");
			 	 
		 }
		 System.out.println("============================");
		 String str1 = "Javar";
		 for(int i=0; i<str1.length()-1;i++) {
			 System.out.print(str1.charAt(i)+ "*");
		 }
		 System.out.println("===================");
		 //Type code to print all unique characters on the console from a given String with a space bettween them
		 //"Java"-----> Jv
		 String str2 = "Cameralar";
				for(int i=0;i<str2.length(); i++) {
					char u= str2.charAt(i);
					if (str2.indexOf(u)==str2.lastIndexOf(u)) {
						System.out.print(u);
					}
				 }
	
	}

}
