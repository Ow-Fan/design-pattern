package visitor;

/**
 * @description: 访问者模式 访问者接口
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 20:01
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
