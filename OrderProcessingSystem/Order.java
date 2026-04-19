package OrderProcessingSystem;

public class Order {
	
	private double amount;
	private OrderStatus status;
	
	public Order(double amount) {
		if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
		
		this.amount = amount;
		this.status = OrderStatus.CREATED;
	}
	
	public void applyDiscount(Discount discount) {
		if (status != OrderStatus.CREATED) {
			throw new IllegalArgumentException("Discount can't apply.");
		}
		
		this.amount = discount.apply(this.amount);
	}
	
	public void pay(Payment payment) {
		if (status != OrderStatus.CREATED) {
			throw new IllegalArgumentException("Order not created");
		}
		
		payment.pay(amount);
		status = OrderStatus.PAID;
	}
	
	public void ship() {
		if (status != OrderStatus.PAID) {
			throw new IllegalArgumentException("Payment not done");
		}
		
		status = OrderStatus.SHIPPED;
	}
		
	@Override
	public String toString() {
		return "Amount: " + amount + ", Status: " + status;
	}

}
