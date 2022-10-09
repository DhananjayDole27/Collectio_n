package simple1;

import java.util.LinkedHashSet;


public class LHSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> al = new LinkedHashSet<Integer>();
		al.add(20);
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(50);
		al.add(60);
		al.add(10);
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
