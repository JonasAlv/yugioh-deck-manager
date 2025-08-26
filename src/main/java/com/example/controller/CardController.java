package com.example.controller;

import com.example.model.Card;
import com.example.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable Long id) {
        return cardService.getCardById(id);
    }

    @PostMapping
    public Card createCard(@RequestBody Card card) {
        return cardService.createCard(card);
    }
}
