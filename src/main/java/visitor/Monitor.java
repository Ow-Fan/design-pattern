package visitor;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 20:04
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        computerPartVisitor.visit(this);
    }
}
