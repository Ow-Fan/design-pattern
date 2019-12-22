package proxy;

/**
 * @description: 代理模式： 给某个对象提供一个代理对象，并由代理对象控制对于原对象的访问，
 * 即客户不直接操控原对象，而是通过代理对象间接地操控原对象
 *
 *Subject：委托对象和代理对象都共同实现的接口
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 21:09
 */
public interface Subject {

    void request();
}
