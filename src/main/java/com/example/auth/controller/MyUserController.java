package com.example.auth.controller;

import com.example.auth.domain.entity.MyUser;
import com.example.auth.domain.request.MyUserRequest;
import com.example.auth.domain.response.TokenInfoResponse;
import com.example.auth.secutiry.TokenInfo;
import com.example.auth.service.MyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/myuser")
public class MyUserController {
    private final MyUserService myUserService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody MyUserRequest request) {
        myUserService.save(request);
    }
    @GetMapping("/me")
    public MyUser me(@AuthenticationPrincipal TokenInfo tokenInfo) {
        return myUserService.getById(tokenInfo.getId());
    }
}
