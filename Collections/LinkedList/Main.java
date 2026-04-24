package Collections.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedList ml = new MyLinkedList();
		
		
		int[] arr = {1, 2, 3, 4};
		
		Node head = ml.convertA2L(arr);
		
		ml.print(head);
		
		System.out.println();
		
		System.out.println(ml.length(head));
		
		ml.print(ml.delete(head));
		
	}

}
