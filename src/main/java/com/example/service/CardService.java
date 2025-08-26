package com.example.service;

import com.example.model.Card;
import com.example.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    public Card getCardById(Long id) {
        return cardRepository.findById(id).orElseThrow(() -> new RuntimeException("Card not found"));
    }

    public Card createCard(Card card) {
        return cardRepository.save(card);
    }
}
