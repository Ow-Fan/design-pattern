package chainofresponsibility;

/**
 * @description: 责任链的某一节点
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 14:21
 */
public class MyConsoleLogger extends AbstractMyLogger {

    public MyConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("AbstractMyLogger MyConsoleLogger write consoleMessage: " + message);
    }
}
