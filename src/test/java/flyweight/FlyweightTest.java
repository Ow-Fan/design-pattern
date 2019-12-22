package flyweight;

import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 20:40
 */
public class FlyweightTest {

    @Test
    public void flyweightTest() {
        shape red = flywightFactory.getShape("RED");
        System.out.println(red);
    }
}
