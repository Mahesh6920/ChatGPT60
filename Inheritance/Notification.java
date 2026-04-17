package Inheritance;

public abstract class Notification {
	protected String notification;
	
	public Notification(String notification) {
		this.notification = notification;
	}
	
	public abstract void send();
}
