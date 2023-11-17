package com.example.springbootkeycloak.example.employeeService;

import com.example.springbootkeycloak.example.Dto.AuthenticationDto;
import com.example.springbootkeycloak.example.Dto.AuthenticationResponseDto;

public interface IAuthenticationService {

    AuthenticationResponseDto authenticate(AuthenticationDto dto);
}
