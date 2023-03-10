package com.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String main(OAuth2AuthenticationToken token) {
        System.out.println("controller hit...");
        return token.getPrincipal().getAttributes().toString();
    }

}
