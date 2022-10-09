package simple1;

import java.util.ArrayList;
import java.util.Vector;

public class ector {

	public static void main(String[] args) {
	Vector<Integer> al = new Vector();
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
               
		ArrayList<Vector<Integer>> KK = new ArrayList<>();
		KK.add(al);
		System.out.println(KK);
	}




	}


