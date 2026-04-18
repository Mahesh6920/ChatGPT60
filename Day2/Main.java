package Day2;

public class Main {

	public static void main(String[] args) {
		Payment p;
		
		p = new UPIPayment();
		p.pay(10);
		
		p = new CardPayment();
		p.pay(20);
	}
}
