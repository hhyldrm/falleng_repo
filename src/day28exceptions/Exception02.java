package day28exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
	/*
	 1) If you get red underline While you type code, it can be Compile Time Exception
	 2)Compile time exceptions are called "checked" exceptions 
	   Run Time exceptions are called "unchecked" exceptions
	 3)The most common "checked" exceptions are
	   i)FileNotFoundException: The Path is wrong or file does not exist
	   ii)IOExeption: It is related with all imput - outputs issues
	 4)If there is IOException, no need to use FileNotFoundException
	 5)If you need to use them in try-catch blocks, the type FileNotFoumdException at top
	 6)e.printStackTrace(); It gives detailed technical information about error
	 */

public class Exception02 {
	
	//how to read a text file
	
	public static void main(String[] args) throws IOException {
	
		readTextFiles2();

	}
	public static void readTextFiles1() throws IOException {
		FileInputStream fis = new FileInputStream("src/day28exceptions/TextFile");
		int i = 0;
		while((i = fis.read()) !=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}
	public static void readTextFiles2(){
		FileInputStream fis = null;
		try {
		fis = new FileInputStream("src/day28exceptions/TextFile"
				+ "/TextFile");
		int i = 0;
		while((i = fis.read()) !=-1) {
			System.out.print((char)i);
		}
		
		}catch (FileNotFoundException e) {
			System.err.println("The path is wrong or file does not exist: " + e.getMessage());
			
		} catch (IOException e) {
			
			System.err.println("File couldnt be read..." + e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				
				System.err.println("The File couldnt be closed or The file couldnt be accessed...");
		}
	}
	

	}	

}
