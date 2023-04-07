package com.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicController {

    @GetMapping("/")
    public String main(OAuth2AuthenticationToken token) {
        log.info(token.toString());
        return token.getPrincipal().getAttributes().toString();
    }
    
    @GetMapping("/unauthenticated")
    public String unAuthenticated() {
        return "hi unauthenticated";
    }

}
