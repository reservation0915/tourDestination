package com.example.auth.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "MyUsers")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyUser {
    @Id
    private UUID id;
    @Column(unique = true)
    private String email;
    private String password;
    private String username;
    private String age;
}
