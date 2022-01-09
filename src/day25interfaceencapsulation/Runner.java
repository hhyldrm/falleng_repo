package day25interfaceencapsulation;

public class Runner {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.bacteriaKiller();
		car1.climaticAc();
		car1.elctronicAc();
		car1.havingHybridEngine();
		car1.run();
		
		//When you use "default" keyword to create "concrete method" in an interface, you can call the method just by using "interface name"
		//By using objects names, you cannot access to the method.
		car1.move();
		
		//When you use "static" keyword to create "concrete method" in an interface, you can call the method just by using "interface name"
		//By using objects names, you cannot acces to the method.
		Vechile.staticMove();
		
		System.out.println(AirCondition.MAKE);//samsung
		System.out.println(HybridEngine.MAKE);//honda
	}

}
