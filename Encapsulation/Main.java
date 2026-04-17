package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Order o = new Order(101, 500);
		
		
		o.markPaid();
//		o.markShipped();
		o.cancel();
		
		
		
		System.out.println("ID: " + o.getId());
		System.out.println("Total amount: " + o.getTotalAmount());
		System.out.println("Status: " + o.getStatus());
		

	}

}
