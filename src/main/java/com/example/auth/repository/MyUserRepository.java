package com.example.auth.repository;

import com.example.auth.domain.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MyUserRepository  extends JpaRepository<MyUser, UUID>{
}
