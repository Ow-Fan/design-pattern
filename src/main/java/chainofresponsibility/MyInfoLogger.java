package chainofresponsibility;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 14:24
 */
public class MyInfoLogger extends AbstractMyLogger {
    public MyInfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("AbstractMyLogger MyInfoLogger write infoMessage: " + message);
    }
}
