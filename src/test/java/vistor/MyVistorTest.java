package vistor;

import org.junit.Test;
import visitor.Computer;
import visitor.ComputerPartDisplayVisitor;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 20:06
 */
public class MyVistorTest {

    @Test
    public void test0001() {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
