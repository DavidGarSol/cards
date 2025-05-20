package com.midominio.cards.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "CARDS")
@IdClass(CardId.class)
public class Card {
	
	@Id
	private String accountNumber;
	@Id
	private String cardNumber;
	private Character cardType;
	private String  status;
	private String creationDate;
	
	@Override
	public String toString() {
		return "Card [accountNumber=" + accountNumber + ", cardNumber=" + cardNumber + ", cardType=" + cardType
		        + ", status=" + status + ", creationDate=" + creationDate + "]";
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Character getCardType() {
		return cardType;
	}
	public void setCardType(Character cardType) {
		this.cardType = cardType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
