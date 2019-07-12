package com.pet.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticResourceConfig extends WebMvcConfigurerAdapter {

	@Value("${resource.avatarResourceLocation}")
	private String avatarResourceLocation;
    @Value("${resource.postResourceLocation}")
    private String postResourceLocation;
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/avatar/**").addResourceLocations("file:" + avatarResourceLocation);
		registry.addResourceHandler("/upload/**").addResourceLocations("file:" + postResourceLocation);
	}
}
