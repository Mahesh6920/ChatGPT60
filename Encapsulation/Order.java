package Encapsulation;

public class Order {

	private int id;
	private OrderStatus status;
	private double totalAmount;
	
	public Order(int id, double totalAmount)  {
		if (id <= 0) throw new IllegalArgumentException("Invalid ID");
		if (totalAmount <= 0) throw new IllegalArgumentException("Invalid amount");
		
		this.id = id;
		this.totalAmount = totalAmount;
		this.status = OrderStatus.CREATED;
	}
	
	public int getId() {
        return id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }
    
    public void markPaid() {
    	if (status != OrderStatus.CREATED) {
    		throw new IllegalStateException("Order must be created for paid");
    	}
    	
    	status = OrderStatus.PAID;
    }
    
    public void markShipped() {
    	if (status != OrderStatus.PAID) {
    		throw new IllegalStateException("Oder must be paid for shipped");
    	}
    	
    	status = OrderStatus.SHIPPED;
    }
    
    public void cancel() {
    	if (status != OrderStatus.CREATED || status != OrderStatus.PAID) {
    		status = OrderStatus.CANCLE;
    	} else if (status != OrderStatus.SHIPPED) {
    		throw new IllegalStateException("Order already shipped");
    	}
    }
	
}
