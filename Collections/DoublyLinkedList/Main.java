package Collections.DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		int[] arr = {18, 27, 32, 47, 58};
		
		MyDLL md = new MyDLL();
		
		Node head = md.convertA2DLL(arr);
		
//		System.out.println(head.next.next.next.back.data);
		
		md.print(head);
		
		System.out.println(md.contains(8, head));
		
		// length of DLL
		int l = md.length(head);
		System.out.println("Length: " + l);
		
		// delete head
		Node head1 = md.deleteHead(head);
		md.print(head1);
		
		// delete tail
		head = md.deleteTail(head);
		md.print(head);
		
		// delete kth element
		head = md.deleteKthElement(27, head);
		md.print(head);
		
		// delete kth node
		head = md.deleteKthNode(7, head);
		md.print(head);

	}

}
