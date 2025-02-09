package com.in28minutes.learn_spring_framework.game;


import org.springframework.stereotype.Component;

/* Section 3-1 특정 클래스의 인스턴스 생성을 Spring에 요청
   Annotation 기반의 Configuration과 Class path Scanning 사용 시 자동 감지 가능
*/
@Component
public class PacManGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("down");
    }

    @Override
    public void left() {
        System.out.println("left");
    }

    @Override
    public void right() {
        System.out.println("right");
    }
}
