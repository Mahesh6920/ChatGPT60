package Collections.DoublyLinkedList;

public class MyDLL {

	public Node convertA2DLL(int[] arr) {
		
		Node head = new Node(arr[0]);
		Node prev = head;
		
		for (int i=1; i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			temp.back = prev;
			prev.next = temp;
			prev = temp;
		}
		
		return head;
	}
	
	public void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public Node deleteHead(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node prev = head;
		
		head = head.next;
		head.back = null;
		
		prev.next = null;
		
		return head;		
	}
	
	public Node deleteTail(Node head) {
		if (head  == null || head.next == null) {
			return head;
		}
		
		Node tail = head;
		
		while (tail.next != null) {
			tail = tail.next;
		}
		
		Node newTail = tail.back;
		
		tail.back = null;
		newTail.next = null;
		
		return head;
	}
	
	public int length(Node head) {
		int c = 0;
		
		Node temp = head;
		
		while (temp != null) {
			temp = temp.next;
			c++;
		}
		
		return c;
	}
}
