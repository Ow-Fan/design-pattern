package decorator;

/**
 * @description: 原味咖啡，咖啡接口的一种实现
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 16:00
 */
public class OriginalCoffee implements Coffee{
    @Override
    public double getPrice() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Water";
    }
}
