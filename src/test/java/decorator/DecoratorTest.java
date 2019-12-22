package decorator;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 16:06
 */
public class DecoratorTest {

    @Test
    public void test01() {
        OriginalCoffee originalCoffee = new OriginalCoffee();
        System.out.println(originalCoffee  + "[" + originalCoffee.getIngredients() + originalCoffee.getPrice() + "]");

        AddMilk addMilk = new AddMilk(originalCoffee);
        System.out.println(addMilk + "[" +addMilk.getIngredients() + addMilk.getPrice() + "]");

        AddSugar addSugar = new AddSugar(originalCoffee);
        System.out.println(addSugar + "[" +addSugar.getIngredients() + addSugar.getPrice() + "]");
    }
}
