package com.example.humo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardMask;
    private String cardNumber;
    private String validityPeriod;
    private Long balance;
    private String pin;
    private LocalDateTime cardAddDate;
    private boolean isBlocked;
    private String cardType;
    private String connectionPhoneNumber;
    private String cardHolder;
}
