package factory.method.product;

/**
 * @description: 具体产品类01
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 14:45
 */
public class ProductA extends AbstractProduct {

    @Override
    public void productInfo() {
        System.out.println("Info: ProductA xxx");
    }
}
