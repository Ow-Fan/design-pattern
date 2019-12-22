package builder.builder;

/**
 * @description: 具体的建造者(具体实施)
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 15:59
 */
public class ConcreteBuilder extends Builder{
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    void bulidA() {
        product.setBuildA("A");
    }

    @Override
    void bulidB() {
        product.setBuildB("B");
    }

    @Override
    void bulidC() {
        product.setBuildC("C");
    }

    @Override
    void bulidD() {
        product.setBuildD("D");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
