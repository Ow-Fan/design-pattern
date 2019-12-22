package proxy;

/**
 * @description: 代理的原对象
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 21:10
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("RealSubject... request");
    }
}
