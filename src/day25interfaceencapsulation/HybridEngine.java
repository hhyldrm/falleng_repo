package day25interfaceencapsulation;

public interface HybridEngine {
	String MAKE = "Honda Eco";
	
	public void havingHybridEngine();
	
	void run();
	
	//Until Java-8 , it was impossible to put a concrete method into an interface.
	//But after Java-8, it is possible by using "default" or "static" keyword.
	public default int power() {
		System.out.println("Hybrid engines are inreasing their powers...");
		return 1000;
		
	}
	

}
