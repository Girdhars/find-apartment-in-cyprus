package com.tech.core;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 
 * @author Girdhar.Singh
 * @date November 16, 2017
 */
public class EmailUtils {

	public static void sendEmail(String apartmentLink) {
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", "localhost");
		Session session = Session.getDefaultInstance(properties);
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("bazaraki@gmail.com"));

			for (String email : MainApp.emailList) {
				message.addRecipients(Message.RecipientType.TO, email);
			}

			//message.setRecipient(Message.RecipientType.TO, new InternetAddress("rathore.girdharsingh@gmail.com"));

			message.setSubject("Latest appartment from bazaraki");
			message.setText("Latest Apartment: " + apartmentLink);
			Transport.send(message);
		} catch (Exception e) {
			System.out.println("Email can't be send: " + e);
		}
	}

	public static void main(String[] args) {
		sendEmail("google.com/index.html");
	}
}
