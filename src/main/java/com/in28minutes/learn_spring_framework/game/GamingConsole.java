package com.in28minutes.learn_spring_framework.game;


import org.springframework.stereotype.Component;

// Section 3-1 @Component 추가
@Component
public interface GamingConsole {
    void up();
    void down();
    void left();
    void right();

}
