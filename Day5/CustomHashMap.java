package Day5;

public class CustomHashMap {
	
	private Node[] buckets;
	
	public CustomHashMap() {
		buckets = new Node[10];
	}
	
	private int getIndex(int key) {
		return Math.abs(key) % buckets.length;
	}
	
	public void put(int key, String value) {
		int index = getIndex(key);
		
		Node head = buckets[index];
		
		if (head == null) {
			buckets[index] = new Node(key, value);
			return;
		}
		
		Node current = head;
		
		while (current != null) {
			if (current.getKey() == key) {
				current.setValue(value);
				return;
			}
			
			if (current.getNext() == null) {
				current.setNext(new Node(key, value));
				return;
			}
			
			current = current.getNext();
		}
		
	}
	
	public String get(int key) {
		int index = getIndex(key);
		
		Node current = buckets[index];
		
		while (current != null) {
			if (current.getKey() == key) {
				return current.getValue();
			}
			current = current.getNext();
		}
		
		return null;
	}
	
	public boolean remove(int key) {
		int index = getIndex(key);
		
		Node current = buckets[index];
		Node prev = null;
		
		while (current != null) {
			if (current.getKey() == key) {
				
				if (prev == null) {
					buckets[index] = current.getNext();
				} else {
					prev.setNext(current.getNext());
				}
				
				return true;
			}
			
			prev = current;
			current = current.getNext();
		}
		
		return false;
		
	}
	
}
