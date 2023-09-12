package com.example.auth.controller;

import com.example.auth.domain.request.MyUserRequest;
import com.example.auth.service.MyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
}
