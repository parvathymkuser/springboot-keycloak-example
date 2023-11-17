package com.example.springbootkeycloak.example.Dto;


import lombok.Getter;
import lombok.Setter;

public class AuthenticationDto {
    private String userName;

    private String password;

    private String clientId;



    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
