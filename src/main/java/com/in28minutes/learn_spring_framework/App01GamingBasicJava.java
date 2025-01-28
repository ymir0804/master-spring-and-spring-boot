package com.in28minutes.learn_spring_framework;
import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

// Section 2-4
public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var SuperContraGame = new SuperContraGame(); // Object Creation
        var gameRunner = new GameRunner(SuperContraGame);
        // SuperContraGame is Dependency
        // Object Creation + Wiring of Dependencies
        gameRunner.run();
    }
}
