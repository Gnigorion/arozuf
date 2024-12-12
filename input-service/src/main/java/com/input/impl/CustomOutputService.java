package com.input.impl;

import org.springframework.stereotype.Service;

import com.fuzora.service.OutputService;

@Service
public class CustomOutputService implements OutputService {
    @Override
    public void sendData(String data) {
        System.out.println("Sending data: " + data);
    }
}