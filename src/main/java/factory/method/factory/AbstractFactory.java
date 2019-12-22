package factory.method.factory;

import factory.method.product.AbstractProduct;

/**
 * @description: 抽象工厂类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 15:08
 */
public abstract class AbstractFactory {

    /**
     * 抽象工厂方法,继承类具体实现具体产品的生成
     * @return AbstractProduct
     */
    public abstract AbstractProduct getProduct();
}
