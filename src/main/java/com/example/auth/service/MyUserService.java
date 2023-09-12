package com.example.auth.service;

import com.example.auth.domain.entity.MyUser;
import com.example.auth.domain.request.MyUserRequest;
import com.example.auth.repository.MyUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserService {
    private final MyUserRepository myUserRepository;
    public void save(MyUserRequest request) {
        myUserRepository.save(request.toEntity());
    }
}
