package day25interfaceencapsulation;

public interface Vechile {

		public default void move() {
			System.out.println("All vehicles should move ...");
		}
		
		public static void staticMove() {
			System.out.println("All vehicles ");
		}
}
