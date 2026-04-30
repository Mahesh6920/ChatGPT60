package Day7;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		int threads = 3;
		
		ExecutorService executor = Executors.newFixedThreadPool(threads);
				
		int totalTasks = 5;
        long chunkSize = 100;

        long start = 0;

        for (int i = 0; i < totalTasks; i++) {
            long end = start + chunkSize - 1;

            executor.submit(new DownloadTask(i, start, end));

            start = end + 1;
        }

        executor.shutdown();

	}

}
