package com.midominio.cards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.midominio.cards.model.Card;
import com.midominio.cards.model.CardId;

public interface CardRepository extends JpaRepository<Card, CardId> {
	
	List<Card> findByAccountNumber(String accountNumber);

}
