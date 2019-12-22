package singleton;

/**
 * @description: 单例模式：懒汉式（需要时去创建实例）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 13:28
 */
public class SingletonPattern_01 {

    /**
     * volatile 保证多线程的线程同步
     */
    private static volatile SingletonPattern_01 instance = null;

    /**
     * 避免外部调用的直接实例化
     */
    private SingletonPattern_01() {}

    /**
     * 线程同步锁
     * @return SingletonPattern_01
     */
    public static synchronized SingletonPattern_01 getInstance() {
        if (instance == null) {
            instance = new SingletonPattern_01();
        }
        return instance;
    }
}
