package day22inheritance;

public class Mammal  extends Animal {
	
	public Mammal() {
		super("Dog");
		System.out.println("No Parameter Mammal Constructor...");
	}
	
	public Mammal(boolean isFeed) {
		super();
		System.out.println("Boolean Mammal Constructor...");
	}
	public void giveBirth() {
		System.out.println("Mammal give birth...");
	}
	public void milkFeed() {
		System.out.println("Mammal milk feed...");
	}
}
