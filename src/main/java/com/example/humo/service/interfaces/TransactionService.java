package com.example.humo.service.interfaces;


import com.example.humo.dto.CheckTransactionDto;
import com.example.humo.dto.FindByIdCardDataDto;
import com.example.humo.dto.GetMoneyDto;
import com.example.humo.dto.GiveMoneyDto;

public interface TransactionService {
    FindByIdCardDataDto findByIdCard(String cardNumber);
    CheckTransactionDto giveMoney(GiveMoneyDto giveMoneyDto);
    CheckTransactionDto getMoney(GetMoneyDto getMoneyDto);










}
