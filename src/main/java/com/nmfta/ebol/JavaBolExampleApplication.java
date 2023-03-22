package com.nmfta.ebol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class JavaBolExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBolExampleApplication.class, args);
	}
	
	@Bean
	public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
		return new OpenAPI().info(new Info()
		.title("NMFTA Example eBOL API")
		.version(appVersion)
		.description("This is an example implementation of the eBOL API with basic GET, POST, PUT, and DELETE operations.")
		.termsOfService("http://swagger.io/terms/")
		.license(new License().name("Apache 2.0")
		.url("http://springdoc.org")));
}
}
