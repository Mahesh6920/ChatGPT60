package Day2;

public class UPIPayment extends Payment{

	@Override
	public void pay(double amount) {
		
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount");
		}
		
		System.out.println("Payment via UPI " + amount);
		
	}

}
