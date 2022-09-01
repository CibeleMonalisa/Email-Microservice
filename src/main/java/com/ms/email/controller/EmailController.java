package com.ms.email.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.email.dto.EmailDto;
import com.ms.email.entity.Email;
import com.ms.email.services.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	EmailService  emailService;
	
	// CREATE E-MAIL
	@Transactional
	@PostMapping("/sending-email")
	public ResponseEntity<Email> sendingEmail(@RequestBody @Valid EmailDto emailDto){
		Email email = new Email();
		BeanUtils.copyProperties(emailDto, email); //converting a Form to Entity
		emailService.sendEmail(email);
		return new ResponseEntity<>(email, HttpStatus.CREATED);
	}
}
