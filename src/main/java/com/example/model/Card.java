package com.example.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type; // Monster, Spell, Trap
    private String attribute; // Light, Dark, Fire, etc.
    private Integer attack;
    private Integer defense;
}
