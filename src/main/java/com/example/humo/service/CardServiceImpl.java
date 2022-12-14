package com.example.humo.service;

import com.example.humo.entity.Card;
import com.example.humo.entity.Token;
import com.example.humo.exception.InsufficientAmountException;
import com.example.humo.repositories.CardRepository;
import com.example.humo.security.JwtProvider;
import com.example.humo.service.interfaces.CardService;
import com.example.humo.service.interfaces.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;
    private final JwtProvider jwtProvider;
    private final TokenService tokenService;
    @Override
    public Card findById(Long id) {
        return cardRepository.findById(id).get();
    }
    @Override
    public Card findByCardNumber(String cardNumber) {
        Optional<Card> byCardNumber = cardRepository.findByCardNumber(cardNumber);
        if (byCardNumber.isEmpty()) {
            throw new InsufficientAmountException("Not found card number");
        }
        return byCardNumber.get();
    }
    @Override
    public Token addCardForGenerateToken(String cardMask) {
        Optional<Card> byCardMask = cardRepository.findByCardMask(cardMask);
        if (byCardMask.isEmpty()) {
            return new Token(null,"Not found card...!",null);
        }
        String s = jwtProvider.generateToken(cardMask);
        Token token=new Token();
        token.setToken(s);
        token.setCardId(byCardMask.get().getId());
        return tokenService.save(token);
    }
    @Override
    public Optional<Card> findByCardNumberForTransaction(String cardNumber) {
        return cardRepository.findByCardNumber(cardNumber);
    }
    @Override
    public Card findByToken(String token) {
        Optional<Token> byToken = tokenService.findByToken(token);
        if (byToken.isEmpty()) {
            throw  new InsufficientAmountException("Not found token.....!");
        }
        return cardRepository.findById(byToken.get().getCardId()).get();
    }
    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Long refresh(String token) {
        Card byToken = findByToken(token);
        return byToken.getBalance();
    }
}

