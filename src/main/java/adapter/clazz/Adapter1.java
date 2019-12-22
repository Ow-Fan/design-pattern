package adapter.clazz;

/**
 * @description: 类适配器模式 适配器对象
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 13:50
 */
public class Adapter1 extends Adaptee1 implements Target1 {
    @Override
    public void targetMethod1() {
        super.adaptee1Method1();
    }

    @Override
    public void targetMethod2() {
        System.out.println("Adapter1 targetMethod2 xxx");
    }
}
