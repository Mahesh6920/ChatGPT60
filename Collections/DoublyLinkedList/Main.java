package Collections.DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		MyDLL md = new MyDLL();
		
		Node head = md.convertA2DLL(arr);
		
//		System.out.println(head.next.next.next.back.data);
		
		md.print(head);
		
		// length of DLL
		int l = md.length(head);
		System.out.println(l);
		
		// delete head
//		Node head1 = md.deleteHead(head);
//		md.print(head1);
		
		// delete tail
		head = md.deleteTail(head);
		md.print(head);

	}

}
