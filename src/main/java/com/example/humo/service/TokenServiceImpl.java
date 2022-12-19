package com.example.humo.service;

import com.example.humo.entity.Token;
import com.example.humo.repositories.TokenRepository;
import com.example.humo.service.interfaces.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {
    private final TokenRepository tokenRepository;
    @Override
    public Token save(Token token) {
        return tokenRepository.save(token);
    }
    @Override
    public Optional<Token> findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
