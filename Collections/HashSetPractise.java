package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractise {

	public static void main(String[] args) {
		Practise();
	}
	
	public static void Practise() {
		Set hs = new HashSet();
		
		hs.add(20);
		hs.add("mani");
		hs.add(30);
		hs.add("mahi");
		hs.add(30);
		
		System.out.println(hs);
		
		
		Iterator i = hs.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		
		System.out.println(hs);
		
		
	}

}
