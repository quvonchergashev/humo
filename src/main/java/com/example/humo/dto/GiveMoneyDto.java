package com.example.humo.dto;

import com.example.humo.entity.EOPS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiveMoneyDto {
    private Long amountTransfer;
    private String cardToken;
    private EOPS eops;
}
