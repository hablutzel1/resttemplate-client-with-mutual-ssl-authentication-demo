package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ClientDemo {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity("https://contoso.com:8443/sslclientauthenticationtest/", String.class);
        System.out.println("Response coming from server -> " + response.getBody());
    }
}
