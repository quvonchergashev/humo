package com.example.humo.controller;

import com.example.humo.dto.CheckTransactionDto;
import com.example.humo.dto.FindByIdCardDataDto;
import com.example.humo.dto.GetMoneyDto;
import com.example.humo.dto.GiveMoneyDto;
import com.example.humo.service.TransactionServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/humo")
public class TransactionController {

    private final TransactionServiceImpl transactionService;

    @GetMapping("/find-by-transaction-card-number/{cardNumber}")
    public ResponseEntity<?> transactionForCard(
            @PathVariable String cardNumber
    ) {
        FindByIdCardDataDto byIdCard = transactionService.findByIdCard(cardNumber);
        return ResponseEntity.ok(byIdCard);
    }

    @PostMapping("/give-money")
    public ResponseEntity<?> giveMoney(
            @RequestBody GiveMoneyDto giveMoneyDto
    ) {
        CheckTransactionDto checkTransaction = transactionService.giveMoney(giveMoneyDto);
        return ResponseEntity.ok(checkTransaction);
    }

    @PostMapping("/get-money")
    public ResponseEntity<?> getMoney(
            @RequestBody GetMoneyDto getMoneyDto
    ) {
        CheckTransactionDto money = transactionService.getMoney(getMoneyDto);
        return ResponseEntity.ok(money);
    }
}
