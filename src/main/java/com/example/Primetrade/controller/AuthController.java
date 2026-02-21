package com.example.Primetrade.controller;

import com.example.Primetrade.dto.request.LoginRequest;
import com.example.Primetrade.dto.response.AuthResponse;
import com.example.Primetrade.entity.User;
import com.example.Primetrade.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // REGISTER
    @PostMapping("/register")
    public User register(@Valid @RequestBody User user) {
        return authService.register(user);
    }

    // LOGIN (returns JWT)
    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {

        String token = authService.login(
                request.getEmail(),
                request.getPassword()
        );

        return new AuthResponse(token);
    }
}