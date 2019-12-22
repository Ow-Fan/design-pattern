package visitor;

/**
 * @description: 定义一个元素的接口
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 20:04
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
