package factory.abstracts.product;

/**
 * @description: 具体的产品B
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 15:24
 */
public class AProduct extends AbstractAProduct {
    @Override
    public void productMessage() {
        System.out.println("message: AProduct xxx");
    }
}
