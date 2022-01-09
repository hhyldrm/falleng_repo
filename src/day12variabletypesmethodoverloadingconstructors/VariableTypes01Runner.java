package day12variabletypesmethodoverloadingconstructors;

public class VariableTypes01Runner {

	public static void main(String[] args) {
		
		VariableTypes01 obj1 = new VariableTypes01();
		System.out.println(obj1.name);//Ali Can
		
		obj1.name = "Veli Han";
		System.out.println(obj1.name);//Veli Han
		
		System.out.println(obj1.id);//null 
		obj1.id= "New Id";
		System.out.println(obj1.id);//New Id
		
		
		
		VariableTypes01 obj2 = new VariableTypes01();
		System.out.println(obj2.name);//Ali Can
		
		System.out.println(obj2.id);//New ID

	}

}
