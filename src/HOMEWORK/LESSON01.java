package HOMEWORK;

public class LESSON01 {

	public static void main(String[] args) { 
		String s = "123-Start!!!";
		System.out.println(s.replaceAll("\\A","!!!"));
		
		System.out.println(s.replaceAll("\\W", ""));
		System.out.println(s.replaceAll("\\w", "*"));
		System.out.println(s.replaceAll("\\W", ""));
		String str = "Ayhan BEYHAN";
		str = str.replace("Ayhan","AYHAN");
		str = str.replaceAll("BEYHAN", "Beyhan");
		System.out.println(str);
		System.out.println("===========================");
		String text = "Nuran cok seviyor Hasani";
		System.out.println(text.replaceAll("Nur", "Has"));
		
		String s1 = "Java is easy ";
		System.out.println(s1.substring(0, 5).toUpperCase());
		System.out.println(s1.concat(str).concat(" ").concat(text));
		System.out.println("=============================");
		String s2 = "123-start";
		System.out.println(s2.replaceAll("[at]", "*"));
		System.out.println(s2.replaceAll("\\d", "+"));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.substring(6).concat("sevgi"));
		
		System.out.println("=================");
		String s3 = "Leanr";
		String s4 = "Java";
		String s5 = " ";
		System.out.println(" " + s3.length()+s4.length());
		System.out.println(15 + s3.length()+s4.length());	
		System.out.println("=============================");
		String s6 = "    ali ayseyi seviyor     ";
		s6 = s6.trim().replaceAll(" ", "");
		System.out.println(s6);
		System.out.println(s6.replaceAll("\\A", "*"));
		
		
				
	
	
		
		
				
		

	}

}
