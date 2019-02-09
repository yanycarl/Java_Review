package annotation;

import java.lang.reflect.Method;

public class Annotation {
	
	@interface MyAnnotation{
		String key() default "Hi";
		String value() default "Hello";
	}


	static class father{
		@MyAnnotation(key = "123", value = "456")
		void print() {
			
		}
	}

	class child extends father{
		
		@Override
		void print() {
			
		}
	}
	
	/**
	 * 	Hello, I am document annotation.
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> cls =Class.forName("java.util.ArrayList"); 
		Method m = cls.getMethod("toString");
		System.out.println(m.getReturnType().getName());
		
	}
}
