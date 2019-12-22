package factory.abstracts.factory;

import factory.abstracts.product.AbstractAProduct;
import factory.abstracts.product.AbstractBProduct;
import factory.abstracts.product.AbstractBaseProduct;

/**
 * @description: 抽象工厂方法
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 15:27
 */
public abstract class AbstractFactory {

    /**
     * 获取A类产品的抽象方法
     * @return
     */
    public abstract AbstractAProduct getAProduct();

    /**
     * 获取B类产品的抽象方法
     * @return
     */
    public abstract AbstractBProduct getBProduct();
}
