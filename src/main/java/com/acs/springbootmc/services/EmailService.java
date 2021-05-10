package com.acs.springbootmc.services;

import org.springframework.mail.SimpleMailMessage;

import com.acs.springbootmc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
