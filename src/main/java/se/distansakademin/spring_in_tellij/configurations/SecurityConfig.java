package se.distansakademin.spring_in_tellij.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .requestMatchers("/custom-login", "/anyone", "/error").permitAll()
                .requestMatchers("/logged-in-only").authenticated()
                .anyRequest().authenticated()
                .and()
                .oauth2Login().loginPage("/custom-login");


        return http.build();
    }
}
