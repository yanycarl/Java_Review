package studyJava;

import java.util.TreeSet;
import java.util.function.Consumer;

public class ClassLib {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set.add(8);
		set.add(1);
		set.add(4);
		set.add(6);
		System.out.println(set);
		set.forEach(item-> {
				set2.add(2*item);
				set2.add(item);
			}
		);
		System.out.println(set2);
	}
}
