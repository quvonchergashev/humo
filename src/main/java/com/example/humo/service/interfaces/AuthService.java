package com.example.humo.service.interfaces;

import com.example.humo.dto.LoginDto;
import com.example.humo.payload.ResponseApi;

public interface AuthService {

    public ResponseApi login(LoginDto loginDto);

}
