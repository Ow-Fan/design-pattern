package builder.builder;

/**
 * @description: 抽象建造者(以创建房子为例)
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 15:57
 */
public abstract class Builder {

    //地基
    abstract void bulidA();
    //钢筋工程
    abstract void bulidB();
    //铺电线
    abstract void bulidC();
    //粉刷
    abstract void bulidD();
    //完工-获取产品
    abstract Product getProduct();
}
