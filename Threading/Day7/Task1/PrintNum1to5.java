package Threading.Day7.Task1;

public class PrintNum1to5 implements Runnable {

	@Override
	public void run() {
		try {
			for (int i=1; i<=5; i++) {
				System.out.print(i + " ");
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
