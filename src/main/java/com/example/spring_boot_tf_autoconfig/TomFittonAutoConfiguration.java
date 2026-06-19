package com.example.spring_boot_tf_autoconfig;

import org.springframework.context.annotation.Bean;

public class TomFittonAutoConfiguration {

    @Bean
    public Person person() {
       IO.println("LOADING BEAN: name (from TomFittonConfiguration)");
       return new Person("Tom Fitton");
    }

}
