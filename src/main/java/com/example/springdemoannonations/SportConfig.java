package com.example.springdemoannonations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.example.springdemoannonations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    // define bean for our sad fortune service. The method name will be the "bean id"
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    // define for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
