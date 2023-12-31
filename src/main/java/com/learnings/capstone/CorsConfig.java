package com.learnings.capstone;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import io.micrometer.common.lang.Nullable;
import jakarta.servlet.http.HttpServletRequest;
@CrossOrigin
@Configuration
public class CorsConfig implements CorsConfigurationSource {

    @Override
    @Nullable
    public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
    	CorsConfiguration config = new CorsConfiguration();
    	config.addAllowedOrigin("*");
    	config.addAllowedMethod("*");
    	config.addAllowedHeader("*");
    	return config;

    }
}
