package br.com.squad44.api;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@EnableSwagger2
@RestController
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

		
	@RequestMapping("")
	public void redirect(HttpServletResponse httpServletResponse) {		
		System.out.println("OPAAAA");
		httpServletResponse.setHeader("Location", "/swagger-ui.html");
		httpServletResponse.setStatus(302);
	}

}
