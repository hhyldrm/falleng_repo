package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement02 {
public static void main(String[] args) {
        
        //Ask user to enter a day, then print if it is “Weekday” or “Weekend day” on the console.
        /*
         The comparison operator "=="
         1) primitives ----> compares values
         2) non-primitive -----> compare values and addresses
         
         to check if a String has the same value with another String, use "equals()" method
         */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a day");
        String day=scan.next().toLowerCase();//monday
        
        if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            System.out.println("Week day");
        } else if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("Weekend day");
        } else {
            System.out.println("Enter the day correctly"); 
            
        }
        
   }
}


