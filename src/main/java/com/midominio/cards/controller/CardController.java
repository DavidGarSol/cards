package com.midominio.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midominio.cards.exception.UnauthorizedException;
import com.midominio.cards.model.Card;
import com.midominio.cards.service.CardService;

@RestController
@RequestMapping("/api")
public class CardController {
	
	@Autowired
	private CardService service;
	
	@GetMapping("/cards")
	public ResponseEntity<List<Card>> getCards() {
		return ResponseEntity.ok(service.getCards());
	}
	
	@GetMapping("/cards/{accountNumber}")
	public ResponseEntity<List<Card>> getByAccountNumber(@PathVariable String accountNumber, @RequestHeader HttpHeaders headers) throws Exception {

		
		switch (accountNumber) {
		
		case "59873572":
//			throw new RuntimeException("Error runtime");
		case "32189843":
//			throw new UnauthorizedException("ERROR XD");
		}

		return ResponseEntity.ok(service.getCardByAccountNumber(accountNumber));
	}

}
