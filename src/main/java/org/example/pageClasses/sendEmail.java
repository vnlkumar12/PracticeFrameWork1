package org.example.pageClasses;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class sendEmail {

    public static void sendStatusEmail(String subject, String body, String recipient) throws MessagingException {
        final String fromEmail = "testautomationreports12@gmail.com"; // Replace with your Gmail address
        final String password = "jiexjwpabzlxcfau"; // Use an App Password for Gmail

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
        message.setSubject(subject);
        message.setText(body);

        Transport.send(message);
    }
}

