import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

// Section 2-4
public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var SuperContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(SuperContraGame);
        gameRunner.run();
    }
}
