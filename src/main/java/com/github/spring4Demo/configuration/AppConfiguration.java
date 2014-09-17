package com.github.spring4Demo.configuration;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Bootstrap web applications in Spring 4 with Java configuration
 *  - http://www.baeldung.com/2011/10/20/bootstraping-a-web-application-with-spring-3-1-and-java-based-configuration-part-1/
 * Some tips optimizing deployment using Spring
 *  - https://developers.google.com/appengine/articles/spring_optimization?hl=es
 * Property files management in Spring 3.1+
 *  - http://www.baeldung.com/2012/02/06/properties-with-spring/
 */
@Configuration
@ComponentScan(basePackages = "com.github.spring4Demo")   // Scan @Controller, @Service ... annotations
@PropertySource("classpath:config.properties")
@Import(PersistenceConfiguration.class)
public class AppConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPlaceholderConfig() {
        return new org.springframework.context.support.PropertySourcesPlaceholderConfigurer();
    }
}
