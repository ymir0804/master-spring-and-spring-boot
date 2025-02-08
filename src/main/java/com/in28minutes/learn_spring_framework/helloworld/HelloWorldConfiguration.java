package com.in28minutes.learn_spring_framework.helloworld;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

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
        return new Person("test", 20, new Address("Main Street", "Utrecht"));
    }

    // Bean Name 지정 가능
    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Baker Street", "London");
    }

    // 여러개의 Bean 객체를 리턴
    // 이름으로 지정하지 않는 경우 Bean 객체명 그대로 가져올 수 있음
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Street", "Lon");
    }

}
