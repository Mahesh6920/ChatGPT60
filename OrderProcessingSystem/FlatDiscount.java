package OrderProcessingSystem;

public class FlatDiscount implements Discount {

	private double value;
	
	public FlatDiscount(double value) {
		if (value <= 0) throw new IllegalArgumentException("Inavalid amount");
		
		this.value = value;
	}
	
	@Override
	public double apply(double amount) {
		
		return Math.max(amount - value, 0);
	}

}
