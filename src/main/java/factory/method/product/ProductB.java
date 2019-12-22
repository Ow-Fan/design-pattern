package factory.method.product;

/**
 * @description: 具体产品类01
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 14:47
 */
public class ProductB extends AbstractProduct {

    @Override
    public void productInfo() {
        System.out.println("Info: ProductB xxx");
    }
}
