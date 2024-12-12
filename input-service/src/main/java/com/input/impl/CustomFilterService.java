package com.input.impl;

import org.springframework.stereotype.Service;

import com.fuzora.service.FilterService;

@Service
public class CustomFilterService implements FilterService {
    @Override
    public String filter(String input) {
        return "Filtered: " + input;
    }
}