package com.example.springbootkeycloak.example.employeeController;

import com.example.springbootkeycloak.example.Dto.AuthenticationDto;
import com.example.springbootkeycloak.example.Dto.AuthenticationResponseDto;
import com.example.springbootkeycloak.example.employeeService.IAuthenticationService;
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
