package com.moon.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaSpringTest {

    private static ApplicationContext context;

    public static void main(String[] args) {
        System.out.println("test.....");
        context = new AnnotationConfigApplicationContext(JavaSpringConfig.class);
        JavaSpringProp obj = (JavaSpringProp) context.getBean("prop");
        
        obj.outContent();
    }
}