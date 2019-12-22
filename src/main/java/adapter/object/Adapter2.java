package adapter.object;

/**
 * @description: 对象适配器模式 适配器对象
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 14:01
 */
public class Adapter2 implements Target2 {

    private Adaptee2 adaptee2;

    public Adapter2(Adaptee2 adaptee2) {
        this.adaptee2 = adaptee2;
    }

    @Override
    public void targetMethod1() {
        adaptee2.adaptee2Method1();
    }

    @Override
    public void targetMethod2() {
        System.out.println("object Adapter2 adapter Target2 targetMethod2");
    }
}
