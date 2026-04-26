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
	
	public Node deleteKthElement(int k, Node head) {
		
		if (contains(k, head)) {
			Node temp = head;
			
			while (temp != null) {
				if (temp.data == k) break;
				
				temp = temp.next;
			}
			
			
			
			Node prev = temp.back;
			Node next = temp.next;
			
			if (prev == null) {
				return deleteHead(head);
			} else if (next == null) {
				return deleteTail(head);
			} else {
				temp.back.next = temp.next;
				temp.next.back = temp.back;
				
				temp.back = null;
				temp.next = null;
				
				return head;
			}
		}
		
		return head;
	}
	
	public boolean contains(int k, Node head) {
		
		Node temp = head;
		
		while (temp != null) {
			if (temp.data == k) {
				return true;
			}
			temp = temp.next;
		}
		
		return false;
	}
	
	public Node deleteKthNode(int n, Node head) {
		
		if (length(head) >= n) {
			if (n == 1) {
				return deleteHead(head);
			} else if (n == length(head)) {
				return deleteTail(head);
			}
			
			Node temp = head;
			int c = 2;
			
			while (temp != null) {
				if (c == n) break;
				
				c++;
				
				temp = temp.next;
			}
			
			Node prev = temp.back;
			Node next = temp.next;
			
			prev.next = next;
			next.back = prev;
			
			temp.next = null;
			temp.back = null;
			
			return head;
		}
		
		return head;
	}
}
