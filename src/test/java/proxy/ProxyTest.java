package proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 21:14
 */
public class ProxyTest {

    /**
     * 静态代理
     */
    @Test
    public void staticProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.request();
    }

    /**
     * 动态代理
     */
    @Test
    public void dynamicProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyHandler proxyHandler = new ProxyHandler(realSubject);
        Subject o = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), proxyHandler);
        o.request();

    }
}
