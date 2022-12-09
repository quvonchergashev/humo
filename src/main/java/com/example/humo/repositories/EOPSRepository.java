package com.example.humo.repositories;

import com.example.humo.entity.EOPS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EOPSRepository extends JpaRepository<EOPS, Long> {
}
