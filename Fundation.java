package fundation;
import java.util.*;

public class Fundation {
	
	private static boolean print() {
		System.out.println("����ұ���ӡ��������û����·");
		return true;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(~7); //������ȡ��
		try{
			System.out.println(5%-12); //����ģ��ֵ
		}
		catch (Exception e) {
			System.out.print("Wrong"+e.getMessage());
		}
		finally {
			System.out.println("Finally"); //������ζ���ִ�У���Return֮ǰ
		};
		System.out.println(true != false); //ȡ��
		System.out.println(true || print()); //��·
		System.out.println(-8>>>1); //���ӷ�������
		; //�����
		int i = 1;
		switch(i){ //����
			case 1: System.out.println("1");break;
			default: break;
		}
		
		char[] a; //����	
		a = new char[3];	//��ʼ��
		System.out.println(a.length); //����
		System.out.println(Integer.SIZE); //λ
		for (double e:a) { //char <=> short ת��
			System.out.println(e); //�Զ���ʼ��Ϊ0
		}
		String b = "hello";
		System.out.println(b.length()); //Ҫ�����ţ�����/0����Cʵ�ֲ�ͬ
		System.out.println(a.getClass().getSimpleName());//��ȡ����
		
		char[] c;
		c = a.clone();
		c[1] = 'p';
		System.out.println(a[1]); //ǳ����
		
		Arrays.sort(c);
		System.out.println(c[2]); //˳���Ѿ����꣬��С����
		
		int d[][]= {{0},{1,2},{3,5,6}};
		//System.out.println(d[1][2]); //�����ǳ�����
		
	}
}
