package Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class LRUCache {

	Map<Integer, Node> mp;
	int capacity;
	Node head, tail;
	
	private ReentrantLock lock = new ReentrantLock();
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.mp = new HashMap<>();
		
		head = new Node(-1, -1);
		tail = new Node(-1, -1);
		
		head.setNext(tail);
		tail.setPrev(head);
	}
	
	public int get(int key) {
		lock.lock();
		try {
			if (mp.containsKey(key)) {
				Node node = mp.get(key);
				
				deleteNode(node);
				insertAfterHead(node);
				
				return node.getValue();
			}
		} finally {
			lock.unlock();
		}
		
		
		return -1;
	}
	
	
	public void put(int key, int value) {
		if (capacity == 0) return;
		
		lock.lock();
		try {
			Node node = mp.get(key);
			if (node != null) {
				
				node.setValue(value);
				
				deleteNode(node);
				insertAfterHead(node);
				
			} else {
				if (capacity == 0) return;
					
				if (mp.size() == capacity) {
					Node lru = tail.getPrev();
					mp.remove(lru.getKey());
					deleteNode(lru);
				}
				
				Node newNode = new Node(key, value); 
				mp.put(key, newNode);
				
				insertAfterHead(newNode);
			}
		} finally {
			lock.unlock();
		}
	}
	
	private void deleteNode(Node node) {
		if (node == null) return;
		
		Node prevNode = node.getPrev();
		Node nextNode = node.getNext();
		
		prevNode.setNext(nextNode);
		nextNode.setPrev(prevNode);
	}
	
	private void insertAfterHead(Node node) {
		Node nextHead = head.getNext();
		
		head.setNext(node);
		node.setPrev(head);
		
		node.setNext(nextHead);
		nextHead.setPrev(node);
		
	}
}
