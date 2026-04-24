package Collections.LinkedList;

public class MyLinkedList {
	
	public Node convertA2L(int[] arr) {
		
		Node head = new Node(arr[0]);
		Node mover = head;
		
		for (int i=1; i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
	}
	
	public void print(Node head) {	
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	public int length(Node head) {
		int c = 0;
		
		while (head != null) {
			head = head.next;
			c++;
		}
		
		return c;
	}
	
	public Node delete(Node head) {
		return head.next;
	}
}
