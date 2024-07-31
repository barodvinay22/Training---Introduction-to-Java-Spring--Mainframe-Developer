package com.hexaware.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@EnableWebSecurity
@Configuration
public class SecurityConfig{
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http.authorizeHttpRequests(request -> request.anyRequest()
//                        .authenticated())
//                .httpBasic(Customizer.withDefaults())
//                .build();
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
//
//        // InMemoryUserDetailsManager
//        UserDetails admin = User.withUsername("admin")
//                .password(encoder.encode("123"))
//                .roles("ADMIN", "USER")
//                .build();
//
//        UserDetails user = User.withUsername("vinay")
//                .password(encoder.encode("123"))
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(admin, user);
//    }
}