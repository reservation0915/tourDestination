package com.example.auth.domain.request;

public record AuthenticationRequest (
        String email,
        String password){
}
