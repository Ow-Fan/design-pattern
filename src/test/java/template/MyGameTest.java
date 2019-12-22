package template;

import bridge.soft.Game;
import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:58
 */
public class MyGameTest {

    @Test
    public void myTest001() {
        MyGame game = new MyCricket();
        game.play();
        System.out.println("=================");
        game = new MyFootball();
        game.play();

    }
}
