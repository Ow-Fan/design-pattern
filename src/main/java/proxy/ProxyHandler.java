package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: 代理模式（动态代理）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 21:16
 */
public class ProxyHandler implements InvocationHandler {

    private Subject subject;

    public ProxyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before dynamicProxy...");
        Object invoke = method.invoke(subject, args);
        System.out.println("Before dynamicProxy...");
        return invoke;
    }
}
