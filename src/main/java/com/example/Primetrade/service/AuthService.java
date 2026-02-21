package com.example.Primetrade.service;
import com.example.Primetrade.dto.response.AuthResponse;
import com.example.Primetrade.entity.User;

public interface AuthService {

    User register(User user);

    AuthResponse login(String email, String password);
}