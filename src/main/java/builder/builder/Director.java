package builder.builder;

/**
 * @description: 指挥者
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 16:01
 */
public class Director {

    //指挥工人按顺序造房
    public Product create(Builder builder) {
        builder.bulidA();
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        return builder.getProduct();
    }
}
