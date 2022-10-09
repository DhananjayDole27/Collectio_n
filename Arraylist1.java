package simple1;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
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
		
		//System.out.println(al);
		//System.out.println(al.get(7));
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));

	}

}
