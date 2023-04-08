package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
            .anyRequest()
            .authenticated()
            .and()
            .oauth2Login()
            .and()
            .logout()
            .logoutSuccessUrl("/login")
            .deleteCookies("JSESSIONID");
        return http.build();
    }

}
