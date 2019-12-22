package decorator;

/**
 * @description: 咖啡装饰器抽象类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 16:01
 */
public class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }
}
