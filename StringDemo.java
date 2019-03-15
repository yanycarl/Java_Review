package studyJava;

import java.io.IOException;

public class StringDemo {
	public static void main(String[] args) {
		String a = "Hello";
		String b = new String("Hello");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.length());
		System.out.println(a.charAt(2));
		
		// Get Chars
		char[] c = new char[100];
		a.getChars(0, 2, c, 0);
		System.out.println(c);
		
		// Value Of
		b = String.valueOf(0.02);
		System.out.println(b.length());
		
		// Upper
		a = a.toUpperCase();
		System.out.println(a);
		
		// Substring
		System.out.println(a.substring(3));
		
		// Runtime
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("python -h");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

