package com.accomodation.Ashram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(authorizeRequests ->
                authorizeRequests
                    .requestMatchers("/login", "/register", "/submit").permitAll()  // Allow access to login and register pages
                    .anyRequest().authenticated()  // All other requests require authentication
            )
            .formLogin(form -> form
                .loginPage("/login")  // Customize the login page if needed
                .permitAll()  // Allow everyone to access the login page
            )
            .logout(logout -> logout
                .logoutUrl("/logout")  // Customize the logout URL if needed
                .logoutSuccessUrl("/login?logout")  // Redirect to login after logout
            );
        return http.build();  // Build the SecurityFilterChain
    }
}
