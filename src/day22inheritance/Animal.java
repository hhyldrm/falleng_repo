package day22inheritance;
/*
 Parent -Child Relations (Inheritance)
 1) Public Class members can be used in child class
 2) protected class members can be used in child class
 3)default class members can be used in child class
 Parent-Child classes must be in the same package
 4)Private class members cant be used in child class
 5)Static class members should be accessed by child class name
 6)Java does not support multiple inheritance,
 A class can have only one parent class
 7)super() is parent constructor call
 8) super() must be in the first line in every constructor
 9) this() must be in the first line as well,
   we can not use this() and super() in the same constructor
 
 
) */



public class Animal {
	
	public Animal() {
		System.out.println("No Parameter Animal Constructor...");
	}
	
	public Animal(String name) {
		System.out.println("String Animal Constructor...");
	}
	int age;
	public void eat() {
		System.out.println("Animals eat...");
	}
	public void drink() {
		System.out.println("Animals drink...");
	}
}
