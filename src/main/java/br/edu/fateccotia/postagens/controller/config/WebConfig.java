package br.edu.fateccotia.postagens.controller.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig {
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS","HEAD","TRACE","CONECT");
	}
}
