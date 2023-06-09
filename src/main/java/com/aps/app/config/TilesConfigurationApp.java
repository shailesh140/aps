package com.aps.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfigurationApp {
	
	@Bean
	public UrlBasedViewResolver urlResolver() {
		UrlBasedViewResolver resolver=new UrlBasedViewResolver();
		resolver.setViewClass(TilesView.class);
		return resolver;
	}
	
	@Bean
	public TilesConfigurer tilesResolver() {
		TilesConfigurer config=new TilesConfigurer();
		String[] def= {"WEB-INF/tiles.xml"};
		config.setDefinitions(def);
		return config;
	}
	
	
	

}
