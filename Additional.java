package studyJava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("Hello");
		}
	}
}

public class Additional {
	
	public static void staticMethod() {
		System.out.println("This");
		return;
	}
	
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		// Array Clone
		int[] a = {2,5,4,2,7,4,1};
		int[] b = new int[40];
		int[] c = null;
		System.arraycopy(a, 0, b, 0, 7);
		System.out.println(b[0]);
		c = Arrays.copyOf(a, 10);
		System.out.println(c[9]);
		System.out.println(c.length);
		c = a.clone();
		System.out.println(c[6]);
		System.out.println(c.length);
		
		// null -> Static
		Additional ins = null;
		ins.staticMethod();
		
		// instanceof
		System.out.println(new Additional() instanceof Additional);
		
		// Convert
		double sum = (2+(3.4/2)+(float)3.6)/(4-(int)3.6);
		System.out.println(sum);
		
//		// Thread
//		MyThread t = new MyThread();
//		t.start();
//		Thread.sleep(1000);
//		t.suspend();
//		Thread.sleep(1000);
//		t.resume();
//		Thread.sleep(1000);
//		t.wait();
//		Thread.sleep(1000);
//		t.notify();
		
		// Reflex
		Method[] a1 = Class.forName("studyJava.Additional").getMethods();
		System.out.println(a1.length);
		for(Method m:a1) {
			System.out.println(m.getName());
		}
		System.out.println(a1[7].getReturnType());
	}
}






