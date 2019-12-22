package singleton;

/**
 * @description: 单例模式：懒汉式（需要时去创建实例,采用双重锁方式实现同步）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 13:40
 */
public class SingletonPattern_04 {

    private static volatile SingletonPattern_04 instance = null;

    private SingletonPattern_04() {}

    public static SingletonPattern_04 getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern_04.class) {
                if (instance == null) {
                    instance = new SingletonPattern_04();
                }
            }
        }
        return instance;
    }
}
