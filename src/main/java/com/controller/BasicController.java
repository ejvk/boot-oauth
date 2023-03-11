package com.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;

@RestController
public class BasicController {

    @GetMapping("/")
    public JSONObject main(OAuth2AuthenticationToken token) {
        
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("Oauth2 log source", token.getAuthorizedClientRegistrationId());
        jsonObject.put("Principal attributes", token.getPrincipal().getAttributes());
        jsonObject.put("Token details", token.getDetails());
        jsonObject.put("Authorities", token.getAuthorities());

        return jsonObject;
    }
    
    @GetMapping("/authenticated")
    public String authenticated() {
        return "success!!!";
    }

}
