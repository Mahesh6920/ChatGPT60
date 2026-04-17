package Inheritance;

public class EmailNotificaiton extends Notification {
	
	private String mail;

	public EmailNotificaiton(String notification, String mail) {
		super(notification);
		this.mail = mail;
	}
	
	public void send() {
		System.out.println("Notification sent: " + notification + " to " + mail);
	}

}
