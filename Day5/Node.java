package Day5;

public class Node {

	private int key;
	private String value;
	private Node next;
	
	public Node(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
		
	public void setNext(Node next) {
		this.next = next;
	}
}
