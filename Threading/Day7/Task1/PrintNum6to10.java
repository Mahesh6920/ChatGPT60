package Threading.Day7.Task1;

public class PrintNum6to10 implements Runnable {
	
	@Override
	public void run() {
		try {
			for (int i=6; i<=10; i++) {
				System.out.print(i + " ");
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
