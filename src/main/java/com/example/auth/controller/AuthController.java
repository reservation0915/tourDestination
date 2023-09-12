package com.example.auth.controller;

import com.example.auth.domain.request.AuthenticationRequest;
import com.example.auth.domain.request.RegisterRequest;
import com.example.auth.domain.response.AuthenticationResponse;
import com.example.auth.domain.response.TokenInfoResponse;
import com.example.auth.secutiry.TokenInfo;
import com.example.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {
    private final UserService userService;

    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequest registerRequest) {
        userService.register(registerRequest);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody AuthenticationRequest authenticationRequest) {
        return userService.authenticate(authenticationRequest);
    }

    @GetMapping("/me")
    public TokenInfoResponse me(@AuthenticationPrincipal TokenInfo tokenInfo) {
        return userService.getMe(tokenInfo);
    }

}
