
package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1: Launch a Spring Context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2: Configure the things that we want Spring to Manage
            // HelloWorldConfiguration에서 - @Configuration 값을 가져옴
            // Bean 객체를 가져오는 방법
            // 1. name - @Bean 관리되는 Bean객체는 메소드 명이 Default
            System.out.println(context.getBean("name"));
            // 2. @Bean Annotation에서 이름 변경 시 getBean을 가져올 때 그대로 가져 와야함
            System.out.println(context.getBean("address2"));
            // 3. Class로 가져오기 -> @Primary를 사용하여 우선 순위 선택
            System.out.println(context.getBean(Address.class));
            // 4. 연관된 Bean으로 가져오기
            System.out.println(context.getBean("person2MethodCall"));
            // 5. Parameter로 가져오기
            System.out.println(context.getBean("person3Parameters"));
            // 6. 여러개의 Bean이 있는 경우 조치 방법 -> Qualifier을 이용하여 가져오는 방법
            System.out.println(context.getBean("person5Qualifier"));
        }


    }
}