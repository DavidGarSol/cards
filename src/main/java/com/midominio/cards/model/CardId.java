package com.midominio.cards.model;

import java.io.Serializable;
import java.util.Objects;

public class CardId implements Serializable{

	private String accountNumber;
	private String cardNumber;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, cardNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardId other = (CardId) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(cardNumber, other.cardNumber);
	}
	
}
