package com.cisco.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts Service REST API",
                description = "Bank microservice - Account service REST API documentation",
                version = "v1",
                contact = @Contact(
                        name = "cisco",
                        email = "sovisrushain@gmail.com",
                        url = "https://sovisrushain.github.io/portfolio/"
                ),
                license = @License(
                        name = "MIT"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Bank microservice - Account service REST API documentation",
                url = "http://localhost:8081/swagger-ui/index.html"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
