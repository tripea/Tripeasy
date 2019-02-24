package com.tripeasy.web.TripEasy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendNotification() throws MailException{
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setTo("shuraut19@gmail.com");
		simpleMailMessage.setFrom("raut.shubh03@gmail.com");
		simpleMailMessage.setSubject("Welcome To TripEasy");
		simpleMailMessage.setText("This is Welcome mail");
		
		javaMailSender.send(simpleMailMessage);
	}
}
