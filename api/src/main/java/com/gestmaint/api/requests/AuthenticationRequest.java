package com.gestmaint.api.requests;

import lombok.*;

@Data
@AllArgsConstructor
public class AuthenticationRequest {

    private String username;
    private String password;

}
