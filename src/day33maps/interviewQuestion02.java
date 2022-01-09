package day33maps;
/*Ask user to enter the number of lines of a pyramide.
	Type a program to create the pyramide.
	For example if the number of lines is 5, the pyramide will be like;     *
																	      * * *
																	    * * * * *
																	  * * * * * * *
																	* * * * * * * * *
*/
public class interviewQuestion02 {

	public static void main(String[] args) {
		
		int k = 0;
		int numOfRows = 5;
		
		for(int i=1; i<=numOfRows; i++,k=0) {
			for(int space = 1; space <=numOfRows-i;space++) {
				System.out.print("  ");
			}
			while(k!=2*i-1) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
		}

	}

}
