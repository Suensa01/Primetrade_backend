package com.example.Primetrade.service;

import com.example.Primetrade.entity.User;

public interface AuthService {

    User register(User user);

    String login(String email, String password);
}