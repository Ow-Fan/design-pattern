package factory.abstracts.factory;

import factory.abstracts.product.*;

/**
 * @description: A类工厂负责A类产品的生成
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 15:29
 */
public class AFactory extends AbstractFactory {

    @Override
    public AbstractAProduct getAProduct() {
        return new AProduct();
    }

    @Override
    public AbstractBProduct getBProduct() {
        return new BProduct();
    }
}
