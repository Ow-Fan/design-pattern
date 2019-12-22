package visitor;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 20:02
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer...");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse...");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard...");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor...");
    }
}
