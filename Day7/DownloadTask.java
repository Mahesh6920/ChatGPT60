package Day7;

public class DownloadTask implements Runnable {
	
	private int taskID;
	private long start;
	private long end;
	
	DownloadTask(int taskID, long start, long end) {
		this.taskID = taskID;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		
		try {
			System.out.println(
				Thread.currentThread().getName() + 
				" Task: " + taskID + " -> " + start + " - " + end
			);
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
