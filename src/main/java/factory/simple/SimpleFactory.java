package factory.simple;

import factory.simple.product.Product;
import factory.simple.product.Product_01;
import factory.simple.product.Product_02;

/**
 * @description: 简单工厂类
 * 负责实现创建所有实例的内部逻辑，并提供一个外界调用的方法，创建所需的产品对象。
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 14:43
 */
public class SimpleFactory {

    /**
     * 根据类型生成具体产品
     * @param type
     * @return
     */
    public static Product getProduct(String type) {
        switch (type) {
            case "01":
                return new Product_01();
            case "02":
                return new Product_02();
            default:
                return null;
        }
    }
}
