package com.in28minutes.learn_spring_framework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String name, String city){};

@Configuration
public class HelloWorldConfiguration {
    // 해당 객체들은 Spring이 관리
    @Bean
    public String name () {
        return "test";
    }
    @Bean
    public int age () {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("test", 20);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }



}
