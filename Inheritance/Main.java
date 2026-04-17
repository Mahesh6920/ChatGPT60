package Inheritance;

public class Main {

	public static void main(String[] args) {
		EmailNotificaiton en = new EmailNotificaiton("Email notification", "mahi@gmail.com");
		en.send();
		
		SMSNotification sn = new SMSNotification("SMS notification", 778078958);
		sn.send();

	}

}
