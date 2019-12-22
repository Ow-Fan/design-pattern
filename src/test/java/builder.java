import builder.builder.ConcreteBuilder;
import builder.builder.Director;
import builder.builder.Product;
import builder.inner.InnerClass;
import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 16:02
 */
public class builder {

    @Test
    public void buildTest() {
        Director director = new Director();
        Product product = director.create(new ConcreteBuilder());
        System.out.println(product);
    }

    @Test
    public void innerTest() {
        InnerClass male = new InnerClass.Builder(1).name("1").sex("male").build();
        System.out.println(male);
    }
}
