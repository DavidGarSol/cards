package com.midominio.cards.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midominio.cards.model.Card;
import com.midominio.cards.repository.CardRepository;
import com.midominio.cards.service.CardService;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardRepository repo;
	
	@Override
	public List<Card> getCards() {
		return repo.findAll();
	}

	@Override
	public List<Card> getCardByAccountNumber(String accountNumber) {
		return repo.findByAccountNumber(accountNumber);
	}

}
