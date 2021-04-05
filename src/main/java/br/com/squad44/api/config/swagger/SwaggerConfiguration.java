package br.com.squad44.api.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

	ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Mochila Cheia API REST")
            .description("<h4>Spring Boot REST API para o projeto do Hackathon Grupo FCamara - Squad44</h4>")
            .version("1.1.1")
            .build();
    }
    
    @Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.squad44.api"))
				.paths(PathSelectors.ant("/**"))				
				.build()
				.apiInfo(apiInfo());
	}
}
