//package com.example.security_stock.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//
//    private final JavaMailSender mailSender;
//
//    public EmailService(JavaMailSender mailSender) {
//        this.mailSender = mailSender;
//    }
//
//    public void sendAccountEmail(String toEmail, String password) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(toEmail);
//        message.setSubject("Your Account Created");
//        message.setText(
//                "Welcome!\n\n" +
//                        "Your account has been created.\n" +
//                        "Email: " + toEmail + "\n" +
//                        "Password: " + password + "\n"
//        );
//
//        mailSender.send(message);
//    }
//}
