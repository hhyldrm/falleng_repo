package day05nestedifternary;

public class AndOrOperators {

	public static void main(String[] args) {
		/*
		1) "AND" operator "&&"
		 If you order water and coffee, then the waiter must bring both of them
		 true&& true ==> true
		 true&& false ==> false
		 false&& true==> false
		 false&& false==>false
		 */
		/*
		 2) "or" operator "||"then the waiter must bring al least one of them
		 If you order water or coffee, 
		 true || true==> true
		 true || false==> true
		 false || true ==> true
		 false || false==> false	 
		 */
		/*
		3) "&" cheks both of the conditions
		   "&&" does not check both conditions if
		   "&&" is faster than "&"
		4) "|" checks both conditions
			"||" does not check the second condition if the first condition is true
			"||" is faster "|"
			
		 */
		System.out.println(5>4 && 3+4==10);//false
		System.out.println(4*2==3 || 7-8==-1);//true
		
	}

}
