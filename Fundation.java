package fundation;
import java.util.*;

public class Fundation {
	
	private static boolean print() {
		System.out.println("如果我被打印出来，就没被短路");
		return true;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(~7); //带符号取反
		try{
			System.out.println(5%-12); //可以模负值
		}
		catch (Exception e) {
			System.out.print("Wrong"+e.getMessage());
		}
		finally {
			System.out.println("Finally"); //无论如何都会执行，在Return之前
		};
		System.out.println(true != false); //取反
		System.out.println(true || print()); //短路
		System.out.println(-8>>>1); //无视符号右移
		; //空语句
		int i = 1;
		switch(i){ //开关
			case 1: System.out.println("1");break;
			default: break;
		}
		
		char[] a; //声明	
		a = new char[3];	//初始化
		System.out.println(a.length); //长度
		System.out.println(Integer.SIZE); //位
		for (double e:a) { //char <=> short 转大
			System.out.println(e); //自动初始化为0
		}
		String b = "hello";
		System.out.println(b.length()); //要加括号，不含/0，与C实现不同
		System.out.println(a.getClass().getSimpleName());//获取类名
		
		char[] c;
		c = a.clone();
		c[1] = 'p';
		System.out.println(a[1]); //浅拷贝
		
		Arrays.sort(c);
		System.out.println(c[2]); //顺序已经换完，从小到大
		
		int d[][]= {{0},{1,2},{3,5,6}};
		//System.out.println(d[1][2]); //并不是长方形
		
	}
}
