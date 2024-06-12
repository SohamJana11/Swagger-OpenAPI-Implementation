package cts.pepsico.Microservice_demo_GET.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
            title = "Book Documentation API",
            description = "Performing CRUD Operation on Swagger, and using H2 database",
            summary = "This Book Documentation API will create, read, update and delete a list of books ",
            termsOfService = "T&C",
            contact = @Contact(
                    name = "Soham Jana",
                    email = "janasoham11@gmail.com"
            ),
            version = "v1"
    ),
        servers = {
            @Server(
                    description = "Development",
                    url = "http://localhost:9090"
            ),
                @Server(
                        description = "Test",
                        url = "http://localhost:9090"
                )
        }
)
public class OpenAPIConfig {
}
