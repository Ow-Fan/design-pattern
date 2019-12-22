package proxy;

import builder.builder.Product;

/**
 * @description: 代理对象（静态代理模式）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 21:12
 */
public class ProxySubject implements Subject{

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("ProxySubject...proxy");
        subject.request();
    }
}
