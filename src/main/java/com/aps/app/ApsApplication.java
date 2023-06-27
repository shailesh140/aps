package com.aps.app;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
@ComponentScan("com.aps.app.*")
@EnableJpaRepositories("com.aps.app.*")
@EntityScan("com.aps.app.*")
public class ApsApplication {

	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(ApsApplication.class, args);
		Runtime rt = Runtime.getRuntime();
		rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:140/APS/home");
		
	}
	
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
             registry.addResourceHandler("/resources/**")
                     .addResourceLocations("/static/resource/");
     }

}
