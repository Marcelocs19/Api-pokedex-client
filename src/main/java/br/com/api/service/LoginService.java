package br.com.api.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.com.api.domain.request.LoginRequest;
import br.com.api.domain.response.LoginResponse;
import br.com.api.http.PokedexApiClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
@Validated
public class LoginService {
    
    private PokedexApiClient client;

    public LoginResponse getToken(@Valid LoginRequest loginRequest) throws Exception {
        log.info("method=getToken");
        return client.getToken(loginRequest);
    }
}
