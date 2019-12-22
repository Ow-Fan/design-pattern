package decorator;

/**
 * @description: 装饰器给咖啡加牛奶
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 16:04
 */
public class AddMilk extends CoffeeDecorator {
    @Override
    public double getPrice() {
        return super.getPrice() + 0.7;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ",Milk";
    }

    public AddMilk(Coffee coffee) {
        super(coffee);
    }
}
