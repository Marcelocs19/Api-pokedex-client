package br.com.api.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.api.domain.request.LoginRequest;
import br.com.api.domain.response.LoginResponse;
import feign.Headers;

@FeignClient(url = "${pokedex.api.login}",name = "pokedex-api")
public interface PokedexApiClient {
    
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    @Headers("Content-type:application/json")
    public LoginResponse getToken(@RequestBody LoginRequest loginRequest)throws Exception;

}
