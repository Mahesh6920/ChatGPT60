package DAY1;

public class Customer extends User {

	private double walletBalance;
	
	public Customer(int id, String name, String mail, String password) {
		super(id, name, mail, password);
	}
	
	public void addMoney(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid amount");
		}
		
		this.walletBalance += amount;
	}
	
	public double getWalletBalance() {
		return walletBalance;
	}
}
