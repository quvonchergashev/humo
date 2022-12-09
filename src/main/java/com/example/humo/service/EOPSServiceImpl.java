package com.example.humo.service;

import com.example.humo.entity.EOPS;
import com.example.humo.repositories.EOPSRepository;
import com.example.humo.service.interfaces.EOPSService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EOPSServiceImpl implements EOPSService {

    private final EOPSRepository eopsRepository;

    @Override
    public EOPS save(EOPS eops) {
        return eopsRepository.save(eops);
    }
}
