package Threading.Day7.Task1;

public class Main {

	public static void main(String[] args) {
		
		PrintNum1to5 p1 = new PrintNum1to5();
		PrintNum6to10 p6 = new PrintNum6to10();
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p6);
		
		t1.start();
		t2.start();

	}

}
