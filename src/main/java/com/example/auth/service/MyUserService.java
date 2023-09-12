package com.example.auth.service;

import com.example.auth.domain.entity.MyUser;
import com.example.auth.domain.request.MyUserRequest;
import com.example.auth.repository.MyUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MyUserService {
    private final MyUserRepository myUserRepository;
    public void save(MyUserRequest request) {
        myUserRepository.save(request.toEntity());
    }
    public MyUser getById(UUID id) {
        return myUserRepository.findById(id).orElseThrow(()-> new RuntimeException("NOT USER"));
    }
}
