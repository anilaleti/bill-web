package com.sreenu.controller;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class BillController {
	@Autowired
	private JavaMailSender mailSender;

	@GetMapping(path = "/msg", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> msg(@RequestParam(value = "msg") String msg) {

		return ResponseEntity.status(200).body(msg);
	};

	// @RequestMapping(value="/healthCheck", produces=
	// {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},method={RequestMethod.GET})

	@GetMapping(path = "/healthCheck", produces = MediaType.APPLICATION_JSON_VALUE)
	public String healthCheck() {
		return "running...";

	}

	@GetMapping(path = "/send", produces = MediaType.APPLICATION_JSON_VALUE)
	public void sendEmail() {

		mailSender.send(getMessagePreparator());

	}

	private MimeMessagePreparator getMessagePreparator() {
		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			public void prepare(MimeMessage message) throws Exception {
				message.setFrom("anil.javaws@gmail.com");
				try {
					message.setRecipient(Message.RecipientType.TO, new InternetAddress("anilkumar.javaws@gmail.com"));

					message.setText("hi..................");
					message.setSubject("receipt");
					mailSender.send(message);
				} catch (AddressException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		return preparator;
	}

}
