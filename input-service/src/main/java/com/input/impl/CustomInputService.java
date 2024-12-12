package com.input.impl;

import org.springframework.stereotype.Service;

import com.fuzora.service.InputService;

@Service
public class CustomInputService implements InputService {
    @Override
    public String getData() {
        return "Custom Data from Input Service";
    }
}