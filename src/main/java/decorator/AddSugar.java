package decorator;

/**
 * @description: 装饰器给咖啡加糖
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 16:03
 */
public class AddSugar extends CoffeeDecorator {

    public AddSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ",Sugar";
    }
}
