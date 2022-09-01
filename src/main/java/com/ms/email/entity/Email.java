package com.ms.email.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ms.email.enums.StatusEmail;

@Entity
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ownerRef; //para filtrar e-mails para determinado usuário
	private String emailFrom; //e-mail de:
	private String emailTo; //e-mail para:
	private String subject; //título do e-mail
	@Column(columnDefinition = "TEXT") //anotação para inserir mais caracteres caso precise
	private String text; //corpo do e-mail
	private LocalDateTime sendDateEmail; //data que o e-mail foi enviado
	private StatusEmail statusEmail; //status do e-mail (sucesso/erro)
	
	public Email() {
		
	}
	
	public Email(String ownerRef, String emailFrom, String emailTo, String subject, String text,
			LocalDateTime sendDateEmail, StatusEmail statusEmail) {
		
		this.ownerRef = ownerRef;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.text = text;
		this.sendDateEmail = sendDateEmail;
		this.statusEmail = statusEmail;
	}




	public String getOwnerRef() {
		return ownerRef;
	}
	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}
	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}
	public void setSendDateEmail(LocalDateTime sendDateEmail) {
		this.sendDateEmail = sendDateEmail;
	}
	public StatusEmail getStatusEmail() {
		return statusEmail;
	}
	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}


}
