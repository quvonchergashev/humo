package com.example.humo.service.interfaces;

import com.example.humo.entity.Card;
import com.example.humo.entity.Token;


import java.util.Optional;
public interface CardService {
     Card findById(Long id);
     Card findByCardNumber(String cardNumber);
     Token addCardForGenerateToken(String cardMask);
     Optional<Card> findByCardNumberForTransaction(String cardNumber);
     Card findByToken(String token);
     Card save(Card card);
     Long refresh(String token);
}
