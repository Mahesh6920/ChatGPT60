package Day6;

public class Node {
	
	private int key;
	private int value;
	private Node prev;
	private Node next;
	
	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
}
