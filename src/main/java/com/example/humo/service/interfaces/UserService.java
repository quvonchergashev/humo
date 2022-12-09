package com.example.humo.service.interfaces;

import com.example.humo.entity.User;
import org.springframework.data.domain.Page;

public interface UserService {



    public Page<User> getAllUser(int page);

    public User getById(Long id);

    public User getByPhoneNumber(String phoneNumber);
}
