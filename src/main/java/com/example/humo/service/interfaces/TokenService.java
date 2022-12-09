package com.example.humo.service.interfaces;

import com.example.humo.entity.Card;
import com.example.humo.entity.Token;

import java.util.Optional;

public interface TokenService {
    Token save(Token token);
    Optional<Token> findByToken(String token);
}
