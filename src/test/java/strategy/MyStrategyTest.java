package strategy;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:53
 */
public class MyStrategyTest {

    @Test
    public void nytest() {
        MyStrategyContext myStrategyContext = new MyStrategyContext(new OptionalAdd());
        System.out.println(myStrategyContext.executeStrategy(1,5));
    }
}
