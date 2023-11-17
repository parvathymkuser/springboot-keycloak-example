package com.example.springbootkeycloak.example.userController;

import com.example.springbootkeycloak.example.userDto.AuthenticationDto;
import com.example.springbootkeycloak.example.userDto.AuthenticationResponseDto;
import com.example.springbootkeycloak.example.userService.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/authenticate")
public class AuthenticationController {
@Autowired
    private IAuthenticationService service;

@PostMapping
    ResponseEntity<AuthenticationResponseDto> authenticate(@RequestBody AuthenticationDto dto){
    return ResponseEntity.ok(service.authenticate(dto));
}
}
