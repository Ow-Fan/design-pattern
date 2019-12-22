package factory.abstracts.product;

/**
 * @description: 继承抽象产品组的抽象类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 15:22
 */
public class AbstractBProduct extends AbstractBaseProduct {
    @Override
    public void productMessage() {
        System.out.println("message: AbstractB xxx");
    }
}
