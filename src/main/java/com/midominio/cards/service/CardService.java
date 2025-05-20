package com.midominio.cards.service;

import java.util.List;

import com.midominio.cards.model.Card;

public interface CardService {
	
	List<Card> getCards();
	List<Card> getCardByAccountNumber(String accountNumber);

}
