package com.hexaware.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @RequestMapping(method = RequestMethod.GET )
    public ResponseEntity<String> getAddress(){
        return null;
    }
}