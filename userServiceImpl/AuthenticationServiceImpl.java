package com.example.springbootkeycloak.example.userServiceImpl;

import com.example.springbootkeycloak.example.userDto.AuthenticationDto;
import com.example.springbootkeycloak.example.userDto.AuthenticationResponseDto;
import com.example.springbootkeycloak.example.userService.IAuthenticationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenticationServiceImpl implements IAuthenticationService {
    @Override
    public AuthenticationResponseDto authenticate(AuthenticationDto dto) {
        try {


            String url = "http://localhost:8080/realms/SpringBootKeycloak/protocol/openid-connect/token";

            MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
            formData.add("client_id", dto.getClientId());
            formData.add("username", dto.getUserName());
            formData.add("password", dto.getPassword());
            formData.add("grant_type", "password");

            // Prepare headers
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            // Create request entity
            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(formData, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
            AuthenticationResponseDto authenticationResponse=null;
            ObjectMapper objectMapper = new ObjectMapper();

            if (response.getStatusCode() == HttpStatus.OK) {
                //System.out.println("Request failed with 2222222222status code: " + response.getStatusCode());

                // Map the response body to your DTO class
                 authenticationResponse = objectMapper.readValue(response.getBody(), AuthenticationResponseDto.class);

                // Use the mapped object as needed
                // System.out.println("Access Token: " + authenticationResponse.getAccess_token());
                // Other properties
                return authenticationResponse;


            } else {
                System.out.println("Request failed with status code: " + response.getStatusCode());
                authenticationResponse = objectMapper.readValue(response.getBody(), AuthenticationResponseDto.class);
                return  authenticationResponse;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }}