package day22inheritance;

public class Dog extends Mammal{
	public Dog() {
		super(true);
		System.out.println("No Parameter Dog Constructor...");
	}
	
	public Dog(int age) {
		super();
		System.out.println("Integer Dog Constructor...");
	}
	public void bark() {
		System.out.println("Dog bark...");
	}
}
