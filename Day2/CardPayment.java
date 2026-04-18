package Day2;

public class CardPayment extends Payment{

	@Override
	public void pay(double amount) {
		
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount");
		}
		
		System.out.println("Payment via Card " + amount);
		
	}

}
