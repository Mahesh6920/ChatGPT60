package Day6;

public class Main {

	public static void main(String[] args) {
		
		LRUCache lru = new LRUCache(2);
		
		lru.put(1,1);
		lru.put(2,2);
		lru.get(1);
		lru.put(3,3); // should evict 2

		System.out.println(lru.get(2)); // -1
		System.out.println(lru.get(1)); // 1
		System.out.println(lru.get(3)); // 3
		
	}

}
