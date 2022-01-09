package day24abstractclass;
	/*
1) Abstract method: any method without body.
   Abstract methods can exist inside abstract classes,
   to make a class abstract, type "abstract" keyword after access modifier
   Concrete method: any method with body
2) To create abstract method
   i) it will not have method body
   ii) we type "abstract" keyword after access modifier
3) Abstract classes can have abstract methods and concrete methods
4) i) abstract methods must be overridden by concrete child class
   ii) abstract methods is optional to be overridden by abstract child class
   iii) concrete methods is optional to be overridden by child class
5) Abstract classes can have concrete and abstract child classes
6) If an abstract method is overridden in a parent class, 
   then it becomes optional to override in child classes.
7) an abstract method can't be final. Final methods body can't be changed,
   but abstract methods must be overridden in concrete child classes.
   This is contradiction.
8) an abstract method can't be private.
9) an abstract method can be protected and default
*/
public abstract class Animal {

	public abstract void eat() ;
		
	public void drink() {
		System.out.println("Animal drink ...");
	}
	
	
}
