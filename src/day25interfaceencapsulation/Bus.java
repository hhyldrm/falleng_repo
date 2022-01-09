package day25interfaceencapsulation;

public class Bus implements AirCondition {

	@Override
	public void elctronicAc() {
		System.out.println("The Bus AC is semi-electrnic...");
		
	}

	@Override
	public void climaticAc() {
		System.out.println("The Bus AC is not climate AC ...");
		
	}

	@Override
	public void bacteriaKiller() {
		System.out.println("The Bus AC kills %85 bacteria...");
	}

	@Override
	public void run() {
		System.out.println("The Bus AC works perfectly");
		
	}

}
