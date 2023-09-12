package com.example.auth.domain.response;

import java.util.UUID;

public record TokenInfoResponse(UUID id, String username, String email, String role){
}
