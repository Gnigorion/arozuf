package com.fuzora.protocol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpProtocol {

    private final RestTemplate restTemplate;

    @Autowired
    public HttpProtocol(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getData(String url) {
        return restTemplate.getForObject(url, String.class);
    }

    public void postData(String url, String data) {
        restTemplate.postForObject(url, data, String.class);
    }
}