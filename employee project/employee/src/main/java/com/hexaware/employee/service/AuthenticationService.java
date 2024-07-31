package com.hexaware.employee.service;

import com.hexaware.employee.dto.LoginUserDto;
import com.hexaware.employee.dto.RegisterUserDto;
import com.hexaware.employee.entity.User;
import com.hexaware.employee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    AuthenticationManager authenticationManager;

    public User registerUser(RegisterUserDto registerUserDto) {
        User user=new User();
        user.setEmail(registerUserDto.getEmail());
        user.setFullName(registerUserDto.getFullName());
        user.setPassword(encoder.encode(registerUserDto.getPassword()));
        return userRepository.save(user);
    }

    public User authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return userRepository.findByEmail(input.getEmail())
                .orElseThrow();
    }
}