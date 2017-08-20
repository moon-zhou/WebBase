package com.moon.common;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class JavaSpringConfig {

    @Bean
    JavaSpringProp prop(){
        return new JavaSpringProp();
    }
}
