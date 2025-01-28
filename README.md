# master-spring-and-spring-boot
Section 2에 해당하는 실습 내용 입니다. 
해당 실습 내용은 SpringBoot가 아닌 SpringFramework에 대한 학습이여서
웹서버는 실행 하지 않음
# Setioon 2-4 OutPut
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
# 2-6 느슨한 결합 도입
- GameRunner 클래스가 Gaming Console Interface와 상호 작용을 하며 모든 게임들이 GamingConsole Interface를 사용 하도록 변경
- AppGamingBasicJava를 변경하지 않아도 인터페이스를 구현 수행
- Mario, SuperContraGame이 GamingConsole을 구현 하여 생성
- GameRunner 생성자에서도 인터페이스를 받도록 수정 
- AppGamingBasic에서도 코드를 변경 하는 것이 감소


# 2-8 Spring Framework 원리
- SpringFramework Application 실행 시 JVM이 시작 되며 Spring Context를 들고옴
  - Configuration Annotation을 생성 후 context를 들고 와서 Spring Framework가 관리하도록 지정
  - getBean을 이용하여 객체의 값을 가져올 수 있음
  - 