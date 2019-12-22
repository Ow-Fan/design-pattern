package decorator;

/**
 * @description: 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装(不增加子类)
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:56
 */
public interface Coffee {
    /**
     * 咖啡分为原味等几种，又可以增加牛奶/糖等配料，如果子类继承则增加太多子类
     */

    /**
     * 获取价格
     * @return
     */
    public double getPrice();

    /**
     * 获取配料
     * @return
     */
    public String getIngredients();
}
