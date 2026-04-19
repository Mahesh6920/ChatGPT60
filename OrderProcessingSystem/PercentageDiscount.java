package OrderProcessingSystem;

public class PercentageDiscount implements Discount {

	private double percentage;
	
	public PercentageDiscount(double percentage) {
		if (percentage < 0 || percentage > 100) {
			throw new IllegalArgumentException("Invalid percentage");
		}
		
		this.percentage = percentage;
	}
	
	@Override
	public double apply(double amount) {
		
		return amount - (amount * percentage / 100);
	}

}
