package Inheritance;

public class SMSNotification extends Notification {
	
	private long phno;

	public SMSNotification(String notification, long phno) {
		super(notification);
		this.phno = phno;
	}
	
	public void send() {
		System.out.println("Notification sent: " + notification + " to " + phno);
	}
}
