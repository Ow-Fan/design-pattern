package adapter;

import adapter.clazz.Adapter1;
import adapter.object.Adaptee2;
import adapter.object.Adapter2;
import org.junit.Test;

/**
 * @description: 适配器模式测试类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 13:51
 */
public class AdapterTest {

    /**
     * 类适配器模式测试
     */
    @Test
    public void clazzTest() {
        Adapter1 adapter1 = new Adapter1();
        adapter1.targetMethod1();
        adapter1.targetMethod2();
    }

    @Test
    public void objectTest() {
        Adapter2 adapter2 = new Adapter2(new Adaptee2());
        adapter2.targetMethod1();
        adapter2.targetMethod2();
    }
}
