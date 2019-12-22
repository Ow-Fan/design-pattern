package singleton;

/**
 * @description: 单例模式:饿汉式（类加载时就创建实例）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 13:34
 */
public class SingletonPattern_02 {

    private static volatile SingletonPattern_02 instance = new SingletonPattern_02();

    private SingletonPattern_02() {}

    public static synchronized SingletonPattern_02 getInstance() {
        return instance;
    }
}
