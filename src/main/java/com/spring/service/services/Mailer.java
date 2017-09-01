package com.spring.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Mailer {

	@Autowired
	private JavaMailSender javaMailService;
	
	
	public void sendMail(String email) {
		SimpleMailMessage mailMessage =  new SimpleMailMessage();
		mailMessage.setTo(email);
		mailMessage.setSubject("Customer Service Registration");
		mailMessage.setText("Customer Service Registration: Successful");
		javaMailService.send(mailMessage);
	}
	
	
}
