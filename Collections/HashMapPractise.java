package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPractise {

	public static void main(String[] args) {
		
		Practise();

	}
	
	public static void Practise() {
		
		Map<Integer, String> hs = new HashMap<>();
		
		hs.put(100, "Mahi");
		hs.put(101, "Ammu");
		hs.put(102, "Siva");
		hs.put(103, "Sitha");
		
		System.out.println(hs);
		
		System.out.println(hs.get(100));
		
		for (Entry<Integer, String> e : hs.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
	}

}
