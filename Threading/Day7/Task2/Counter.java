package Threading.Day7.Task2;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private int count = 0;
	private ReentrantLock lock = new ReentrantLock();
	
	synchronized void increment() {
		lock.lock();
		try {
			count++;
		} finally {
			lock.unlock();
		}
	}
	
	public int getCount() {
		return count;
	}
	
}
