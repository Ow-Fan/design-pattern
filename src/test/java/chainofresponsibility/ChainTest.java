package chainofresponsibility;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 14:26
 */
public class ChainTest {

    @Test
    public void chainTest1() {
        MyInfoLogger myInfoLogger = new MyInfoLogger(AbstractMyLogger.INFO);
        MyConsoleLogger myConsoleLogger = new MyConsoleLogger(AbstractMyLogger.DEBUG);
        MyErrorLogger myErrorLogger = new MyErrorLogger(AbstractMyLogger.ERROR);

        myConsoleLogger.setNextLogger(myInfoLogger);
        myErrorLogger.setNextLogger(myConsoleLogger);

        myErrorLogger.logMessage(AbstractMyLogger.INFO,"info");
        myErrorLogger.logMessage(AbstractMyLogger.DEBUG,"DEBUG");
        myErrorLogger.logMessage(AbstractMyLogger.ERROR,"ERROR");
    }
}
