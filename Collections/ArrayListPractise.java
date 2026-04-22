package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractise {

	public static void main(String[] args) {
		Practise();
		
	}
	
	public static void Practise() {
		ArrayList al = new ArrayList();
		
//		Adding
		al.add(20);
		al.add("mahi");
		al.add(40);
		al.add("ravi");
				
		System.out.println(al);
		
		al.add(1, 30);
		al.add(1, "mani");
		
		System.out.println(al);
		
		al.addAll(al);
		al.addFirst(null);
		al.addLast(null);
		
		System.out.println(al);
		
		
//		Retreving
		

		System.out.println(al.getClass());
		
		System.out.println(al.get(2));
		
		System.out.println(al.retainAll(al));
		
//		Remove 
		
		al.remove(0);
		al.remove(al);
//		al.remove(0);
//		al.removeAll(al);
//		al.removeIf();

		
		System.out.println(al);
		
		System.out.println(al.reversed());
		
		
		System.out.println(al.contains("mani"));
		
		System.out.println(al.indexOf(20));
		System.out.println(al.lastIndexOf(20));
		
		System.out.println(al.set(0, al));
		
		Iterator i = al.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
		
		
	}

}
