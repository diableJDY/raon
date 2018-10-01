package com.raon.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorPageConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    private static final Logger logger = LoggerFactory.getLogger(ErrorPageConfig.class);

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
//        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error"));
//        factory.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/error"));
        factory.addErrorPages(new ErrorPage("/error"));
    }
}
