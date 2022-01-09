package day25interfaceencapsulation;

public class Car implements AirCondition, HybridEngine, Vechile{

	@Override
	public void elctronicAc() {
		System.out.println("The Car AC is electrnic...");
		
	}

	@Override
	public void climaticAc() {
		System.out.println("The Car AC is climate AC ...");
		
	}

	@Override
	public void bacteriaKiller() {
		System.out.println("The Car AC kills %99.9 bacteria...");
		
	}

	@Override
	public void havingHybridEngine() {
		System.out.println("The Car engine is hybrid");
	}

	@Override
	public void run() {
		System.out.println("The Car AC works perfectly");
		
	}

}
