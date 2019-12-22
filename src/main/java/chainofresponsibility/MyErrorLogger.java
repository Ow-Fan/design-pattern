package chainofresponsibility;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 14:23
 */
public class MyErrorLogger extends AbstractMyLogger {
    public MyErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("AbstractMyLogger MyErrorLogger write errorMessage: " + message);
    }
}
