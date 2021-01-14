package br.com.api.pokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiPokedexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPokedexApplication.class, args);
	}

}
