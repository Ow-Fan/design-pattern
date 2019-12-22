package compopsite;

/**
 * @description: 组合模式：component (抽象构件：容器)：
 * 它可以是接口或者抽象类，
 * 为叶子构建和子容器构建对象声明接口，
 * 在该角色中可以包含所有子类共有的行为的实现和声明
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:28
 */
public abstract class AbstractFile {
    /**
     *  增加子构件
     * @param abstractFile
     */
    public abstract void add(AbstractFile abstractFile);

    /**
     * 移除子构件
     * @param abstractFile
     */
    public abstract void remove(AbstractFile abstractFile);

    /**
     * 获取子构件
     * @param i
     */
    public abstract AbstractFile get(int i);

    /**
     * 其它业务操作
     */
    public abstract void optionMethod();
}
