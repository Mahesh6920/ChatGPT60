package Day5;

public class Main {

	public static void main(String[] args) {
		
		CustomHashMap cm = new CustomHashMap();
		
		cm.put(100, "Mahi");
		cm.put(101, "Ammu");
		
		System.out.println(cm.get(101));
		
		cm.put(10, "new");
		cm.put(20, "new");
		
		System.out.println(cm.get(10));
		
		
		if (cm.remove(10)) {
			System.out.println("Key: " + 10 + " removed");
		}

	}

}
