package OrderProcessingSystem;

public class Main {

	public static void main(String[] args) {
		
		Order o = new Order(200);
		o.applyDiscount(new FlatDiscount(100));
		o.pay(new UPIPayment());
		
		System.out.println(o);
		
		System.out.println();
		
		Order o1 = new Order(500);
		o1.applyDiscount(new PercentageDiscount(50));
		o1.pay(new CardPayment());
		
		System.out.println(o1);
		
		o1.ship();
		System.out.println(o1);

	}

}
