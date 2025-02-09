# master-spring-and-spring-boot  

# Section 2  

## Setioon 2-4 OutPut  
```bash
> Task :compileJava UP-TO-DATE
> Task :processResources UP-TO-DATE
> Task :classes UP-TO-DATE

> Task :AppGamingBasicJava.main()
Running game:com.in28minutes.learn_spring_framework.game.MarioGame@54bedef2

BUILD SUCCESSFUL in 754ms
3 actionable tasks: 1 executed, 2 up-to-date
오후 5:22:19: Execution finished ':AppGamingBasicJava.main()'.

```
## 2-6 느슨한 결합 도입
- GameRunner 클래스가 Gaming Console Interface와 상호 작용을 하며 모든 게임들이 GamingConsole Interface를 사용 하도록 변경
- AppGamingBasicJava를 변경하지 않아도 인터페이스를 구현 수행
- Mario, SuperContraGame이 GamingConsole을 구현 하여 생성
- GameRunner 생성자에서도 인터페이스를 받도록 수정 
- AppGamingBasic에서도 코드를 변경 하는 것이 감소


## 2-8 Spring Framework Bean 객체 관리 원리
- SpringFramework Application 실행 시 JVM이 시작 되며 Spring Context를 들고옴
  - Configuration Annotation을 생성 후 context를 들고 와서 Spring Framework가 관리하도록 지정
  - getBean을 이용하여 객체의 값을 가져올 수 있음

## 2-11 Spring Frameowrk Q&A
- Spring Container / Spring Context  / IoC Container
  - Spring Bean과 Bean 객체의 수명주기를 관리
  - @configuatrion 어노테이션을 이용하여 생성한 객체 관리
  - IoC 컨테이너가 런타임 시스템을 생성
  - Bean Factory는 Basic Spring Container
- Application Context
  - AOP, Internationalization과 같은 것들을 하기 쉽게 해주는 것
    - AnnotationConfigApplicationContext 객체
- POJO(Plain Old Java Object)
  - 모든 자바 객체는 POJO
- Java Bean (EJB)
  - Constructor에 Argument가  없어야함
  - getter와 setter가 있어야함
  - Serializalbe 인터페이스를 구현해야함
- Spring Bean
  - 스프링 프레임워크에서 관리되는 모든 Bean 객체
- 여러개의 Bean이 있는 경우 우선 조치으로 사용할 수 있는 방법


# Section 3  

## 3-1 Bean 객체 감소
- Component & ComponentScan Annotation을 통해 Spring이 객체 관리

## 3-2 여러개의 Bean이 있는 경우 해결 방법
- NoUniqueBeanDefinitionException 발생
- Primary, Qualifier Annotation을 통해 해결

## 3-3 Primary vs Qualifier 비교
- 
