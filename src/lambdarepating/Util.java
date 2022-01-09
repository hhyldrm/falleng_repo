package lambdarepating;

public class Util {
	public static void printInTheSameLineWithSpace(Object str) {
		System.out.print(str + " ");
	}
	public static boolean checkToBeEven (int x) {
	return x%2==0;	
	}
	public static boolean checkToBeOdd(int y) {
		return y%2!=0;
	}
	public static int getSquare(int x) {
		return x*x;
	}
	public static int getCube(int x) {
		return x*x*x;
	}
	public static double getHalf(double x) {
		return x/2;
	}
	public static char getLastCahr(String str) {
		return str.charAt(str.length()-1);
		
	}
	public static char getFirstChar(String str) {
		return str.charAt(0);
	}
	
}