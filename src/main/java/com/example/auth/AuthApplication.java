package com.example.auth;

import com.example.auth.domain.dto.CustomUrl;
import com.example.auth.secutiry.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public Map<Role, CustomUrl> urlList() {
        Map<Role, CustomUrl> map = new HashMap<>();
        map.put(Role.YJ, new CustomUrl("http://localhost:8000", "http://localhost:3000/auth"));
        map.put(Role.KS, new CustomUrl("http://localhost:8000", "http://localhost:3000/auth"));
        map.put(Role.JS, new CustomUrl("http://localhost:8000", "http://localhost:3000/auth"));
        map.put(Role.JK, new CustomUrl("http://localhost:8000", "http://localhost:3000/auth"));
        map.put(Role.KH, new CustomUrl("http://localhost:8000", "http://localhost:3000/auth"));
        map.put(Role.JH, new CustomUrl("http://localhost:8000", "http://localhost:3000/auth"));
        map.put(Role.TEST, new CustomUrl("http://localhost:8000", "http://localhost:3000/auth"));
        return map;
    }

}
