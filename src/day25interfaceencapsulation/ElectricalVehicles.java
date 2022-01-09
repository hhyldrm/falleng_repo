package day25interfaceencapsulation;

public abstract class ElectricalVehicles implements AirCondition, HybridEngine{

	@Override
	public void climaticAc() {
		System.out.println("The electrical vehicles AC... ");
		
	}

	@Override
	public void run() {
		System.out.println("Electrical vehicles is the best...");
		
	}

	@Override
	public abstract void elctronicAc(); 
		
		
	

}
