package day13statickeyword;

public class CarsRunner {

	public static void main(String[] args) {
		
		//Using classname, we can acces only static variables
		System.out.println(Cars.numOfCars);
		
		Cars c1 =new Cars();
		//using object name, we can access instance variables
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
		
		//Using object name, we can access static variables
		//but it is not recommended
		System.out.println(c1.numOfCars);
		
		//Using class name, we can access only static methods
		System.out.println(Cars.engine());
		//Using object name, we can access instance methods
		c1.drive();
		//Using object name, we can access  static methods
		//But it is not recommend
		System.out.println(c1.engine());
	
		Cars c2=new Cars("Honda","Civic",2010,8500);
		
		String vinC2 =Cars.createVin(c2);
		System.out.println(vinC2);
		
		
		
		
	}

}
