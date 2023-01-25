package javaFundamentals;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set<Integer> t = new HashSet<Integer>();
		
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(3);
		t.add(4);
		
		System.out.println(t);
		
		int setSize = t.size();
		System.out.println(setSize);
		
		boolean setContains = t.contains(2);
		System.out.println(setContains);
		
		
		t.clear();
		System.out.println(t);
		
		boolean isEmpty = t.isEmpty();
		System.out.println(isEmpty);
		

		
		
		
		
		
		String names[] = {"mario", "luigu", "yoshi"};
		Set<String> m = new HashSet<String>();
		
		for(String name : names) {
			m.add(name);
		}
		
		System.out.println(m);
		
	}

}
