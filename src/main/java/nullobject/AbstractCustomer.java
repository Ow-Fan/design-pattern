package nullobject;

/**
 * @description: 空對象模式 用空對象代替控制
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:42
 */
public abstract class AbstractCustomer {

    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}
