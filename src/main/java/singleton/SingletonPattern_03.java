package singleton;

/**
 * @description: 单例模式：懒汉式（需要时去创建实例,采用内部类方式）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 13:36
 */
public class SingletonPattern_03 {


    private SingletonPattern_03() {}

    private static final class InnerClass {
        private static volatile SingletonPattern_03 instance = new SingletonPattern_03();
    }

    public static synchronized SingletonPattern_03 getInstance() {
        return InnerClass.instance;
    }
}
