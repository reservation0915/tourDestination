package com.example.auth.domain.request;

public record RegisterRequest(
        String username, String password, String email, String role) {
}
