package simple1;

import java.util.TreeSet;

public class TSet {

	public static void main(String[] args) {
		TreeSet<Integer> al = new TreeSet<Integer>();
		al.add(90);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(90);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		System.out.println(al);

		System.out.println(al.isEmpty());
		System.out.println(al.size());

	}

}
