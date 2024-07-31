package com.hexaware.employee.controller;

import com.hexaware.employee.dto.LoginResponse;
import com.hexaware.employee.dto.LoginUserDto;
import com.hexaware.employee.dto.RegisterUserDto;
import com.hexaware.employee.entity.User;
import com.hexaware.employee.service.AuthenticationService;
import com.hexaware.employee.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class UsersController {
        @Autowired
        private AuthenticationService authenticationService;
        @Autowired
        private JwtService jwtService;
        @PostMapping("/signup")
        public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto ){
                return new ResponseEntity<>(authenticationService.registerUser(registerUserDto), HttpStatus.CREATED);
        }
        @PostMapping("/login")
        public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto) {
                User authenticatedUser = authenticationService.authenticate(loginUserDto);

                String jwtToken = jwtService.generateToken(authenticatedUser);

                LoginResponse loginResponse = new LoginResponse();
                loginResponse.setToken(jwtToken);
                loginResponse.setExpiresIn(jwtService.getExpirationTime());

                return ResponseEntity.ok(loginResponse);
        }
}