package singleton;

import org.junit.Test;

/**
 * @description: 单例模式测试
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 13:48
 */
public class SingletonTest {

    /**
     * result:
     * singleton.SingletonPattern_01@7db8c75f
     * singleton.SingletonPattern_01@7db8c75f
     */
    @Test
    public void SingleTonPattern_01() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                SingletonPattern_01 instance1 = SingletonPattern_01.getInstance();
                System.out.println(instance1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                SingletonPattern_01 instance2 = SingletonPattern_01.getInstance();
                System.out.println(instance2);
            }
        });

        thread1.start();
        thread2.start();
    }

    /**
     * result:
     * singleton.SingletonPattern_02@6cd21640
     * singleton.SingletonPattern_02@6cd21640
     */
    @Test
    public void SingleTonPattern_02() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                SingletonPattern_02 instance1 = SingletonPattern_02.getInstance();
                System.out.println(instance1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                SingletonPattern_02 instance2 = SingletonPattern_02.getInstance();
                System.out.println(instance2);
            }
        });

        thread1.start();
        thread2.start();
    }

    /**
     * result:
     * [Thread-1]：singleton.SingletonPattern_03@64de9727
     * [Thread-0]：singleton.SingletonPattern_03@64de9727
     */
    @Test
    public void SingleTonPattern_03() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                SingletonPattern_03 instance1 = SingletonPattern_03.getInstance();
                String name = Thread.currentThread().getName();
                System.out.println("[" + name + "]：" + instance1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                SingletonPattern_03 instance2 = SingletonPattern_03.getInstance();
                String name = Thread.currentThread().getName();
                System.out.println("[" + name + "]：" + instance2);
            }
        });

        thread1.start();
        thread2.start();
    }

    /**
     * singleton.SingletonPattern_04@10bbd20a
     * singleton.SingletonPattern_04@10bbd20a
     */
    @Test
    public void SingleTonPattern_04() {
        SingletonPattern_04 instance1 = SingletonPattern_04.getInstance();
        SingletonPattern_04 instance2 = SingletonPattern_04.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

    }
}
