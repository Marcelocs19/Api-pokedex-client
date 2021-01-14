package br.com.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.domain.request.LoginRequest;
import br.com.api.domain.response.LoginResponse;
import br.com.api.service.LoginService;
import lombok.AllArgsConstructor;

@RequestMapping("/login")
@AllArgsConstructor
@RestController
public class LoginController {
    
    private LoginService service;

    @PostMapping
    public ResponseEntity<LoginResponse> getToken(@RequestBody LoginRequest login) throws Exception {
        return ResponseEntity.ok().body(service.getToken(login));
    }
}
