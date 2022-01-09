package constructor01;

public class cons01 {

	String name = "emily";
	int age = 20;
	
	 cons01(String name, int age){
		this.name= name;
		this.age=22;
	}
	
	public static void main(String[] args) {
		
		cons01 st=new cons01("oliver", 21);
		System.out.print(st.name);
		System.out.print(", "+ st.age);
	}

}
