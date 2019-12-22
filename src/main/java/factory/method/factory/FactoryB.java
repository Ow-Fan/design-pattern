package factory.method.factory;

import factory.method.product.AbstractProduct;
import factory.method.product.ProductB;

/**
 * @description: 具体实现工厂
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 15:11
 */
public class FactoryB extends AbstractFactory {
    @Override
    public AbstractProduct getProduct() {
        return new ProductB();
    }
}
