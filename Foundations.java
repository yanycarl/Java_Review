package studyJava;

import java.util.Arrays;

public class Foundations {
	public static void main(String[] args) {
		// Max \ Min value
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// Boolean
		System.out.println(true);
		System.out.println(false);
		
		// Convert
		System.out.println((byte)130); // Overflow
		System.out.println((double)1);
		
		// Reverse
		System.out.println(~1);
		
		// Bit And
		System.out.println(2 & 6);
		
		// %
		System.out.println(16 % 9.5);
		
		boolean a = true;
		// Short Path
		System.out.println( true || (a = false));
		System.out.println(a);
		
		// floor
		System.out.println(Math.floor(6.6));
		
		// if
		a = false? true:false; 
		System.out.println(a);
		
		// shift
		System.out.println(36 >>> 2);
		
		// for
		int b[] = {1, 5, 6, 7};
		for(int e:b) {
			System.out.println(e);
		}
		
		// array address
		System.out.println(b.toString());
		
		// Array sort
		Arrays.sort(b);
		
		// Array length
		System.out.println(b.length);
		
		// == equal for String
		System.out.println(new String("Hello").equals(new String("Hello")));
		System.out.println(new String("Hello") == new String("Hello"));
		
		// Boxing
		System.out.println(new Integer(12).equals(12));
		Integer c = 123;
		Integer d = 123;
		System.out.println(c == d);
			
		// Equal
		Foundations f = new Foundations();
		Foundations g = new Foundations();
		System.out.println(f.equals(g));
	}
	
	// overwrite equals
	public boolean equals(Object e) {
		if(e instanceof Foundations) {
			Foundations f = (Foundations)e;
			return false;
		}
		else {
			return false;
		}
	}
}



