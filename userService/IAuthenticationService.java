package com.example.springbootkeycloak.example.userService;

import com.example.springbootkeycloak.example.userDto.AuthenticationDto;
import com.example.springbootkeycloak.example.userDto.AuthenticationResponseDto;

public interface IAuthenticationService {

    AuthenticationResponseDto authenticate(AuthenticationDto dto);
}
