package factory;

import factory.abstracts.factory.AFactory;
import factory.abstracts.factory.AbstractFactory;
import factory.method.factory.FactoryA;
import factory.method.factory.FactoryB;
import factory.simple.product.Product;
import factory.simple.SimpleFactory;
import org.junit.Test;

/**
 * @description: 工厂方法测试类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 14:54
 */
public class FactoryTest {

    @Test
    public void simpleTest() {
        Product product1 = SimpleFactory.getProduct("01");
        product1.productInfo();
        Product product2 = SimpleFactory.getProduct("02");
        product2.productInfo();

    }

    @Test
    public void methodTest() {
        FactoryA factoryA = new FactoryA();
        factoryA.getProduct().productInfo();
        FactoryB factoryB = new FactoryB();
        factoryB.getProduct().productInfo();

    }

    @Test
    public void abstractTest() {
        AFactory aFactory = new AFactory();
        aFactory.getAProduct().productMessage();
        aFactory.getBProduct().productMessage();
    }
}
