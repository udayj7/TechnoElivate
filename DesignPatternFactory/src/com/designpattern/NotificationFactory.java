package com.designpattern;

interface Notification {
	void message();

}

class SMSNotification implements Notification {
	@Override
	public void message() {
		System.out.println("Sending an SMS Notification");
	}
}

class EmailNotification implements Notification {

	@Override
	public void message() {
		System.out.println("Sending an Email Notification");
	}
}

public class NotificationFactory {
	public Notification getInstance(String s) {
		if (s.equals("SMS")) {
			return new SMSNotification();
		} else if (s.equals("Email")) {
			return new EmailNotification();
		} else
			return null;
	}

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.getInstance("Email");
		notification.message();
	}
}
