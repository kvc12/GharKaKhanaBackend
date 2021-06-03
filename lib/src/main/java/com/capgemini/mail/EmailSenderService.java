package com.capgemini.mail;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
 
@Service
public class EmailSenderService {
 
    @Autowired
    private JavaMailSender mailSender;
 
    @Autowired
    EmailSenderService mailService;
 
    public void sendMail(String toMail, String subject, String body) {
 
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toMail);
        message.setSubject(subject);
        message.setText(body);
 
        mailSender.send(message);
    }
 
}