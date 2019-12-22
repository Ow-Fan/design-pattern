package observer;

/**
 * @description: 观察
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:49
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
