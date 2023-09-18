package com.example.auth.service;

import com.example.auth.domain.dto.CustomUrl;
import com.example.auth.domain.entity.User;
import com.example.auth.domain.request.AuthenticationRequest;
import com.example.auth.domain.request.RegisterRequest;
import com.example.auth.domain.response.AuthenticationResponse;
import com.example.auth.domain.response.TokenInfoResponse;
import com.example.auth.repository.UserRepository;
import com.example.auth.secutiry.JwtService;
import com.example.auth.secutiry.Role;
import com.example.auth.secutiry.TokenInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final Map<Role, CustomUrl> urlList;


    public void register(RegisterRequest request) {
        User user = User.builder()
                .email(request.email())
                .username(request.username())
                .password(passwordEncoder.encode(request.password()))
                .role(Role.valueOf(request.role()))
                .build();
        userRepository.save(user);

    }
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        User user = userRepository.findByEmail(request.email())
                .orElseThrow(()->new RuntimeException("User Not Found"));
        if(passwordEncoder.matches(user.getPassword(), request.password())){
            throw new RuntimeException("User Not Found");
        }
        String jwtToken = jwtService.generateToken(user);
        String redirectUrl = urlList.get(user.getRole()).redirectUrl();
        return new AuthenticationResponse(jwtToken, redirectUrl);
    }
    public TokenInfoResponse getMe(TokenInfo tokenInfo) {
        return new TokenInfoResponse(tokenInfo.getId(), tokenInfo.getUsername(),tokenInfo.getEmail(), tokenInfo.getRole().name());
    }

    //내가 적음 수정함
    public TokenInfo getTokenInfo(String token)
    {
        return jwtService.extractUser(token);
    }


}
