package src;

import java.awt.*;
import java.util.Random;

public class MouseMotion {

    public static final int SLEEP_TIME = 5000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(SLEEP_TIME);
        }
    }


}
