package com.example.humo.repositories;
import com.example.humo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByPhoneNumber(String phoneNumber);




}
