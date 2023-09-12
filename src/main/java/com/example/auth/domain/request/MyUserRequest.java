package com.example.auth.domain.request;

import com.example.auth.domain.entity.MyUser;

import java.util.UUID;

public record MyUserRequest(UUID id, String email, String password, String username, String age) {
    public MyUser toEntity() {
        return MyUser.builder()
                .id(id)
                .email(email)
                .password(password)
                .username(username)
                .age(age)
                .build();
    }
}
