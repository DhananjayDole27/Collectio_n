package simple1;

import java.util.ArrayList;
import java.util.LinkedList;

public class lList {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println(al);
		System.out.println(al.get(7));
		System.out.println(al.isEmpty());
		System.out.println(al.size());

	}

}


	


