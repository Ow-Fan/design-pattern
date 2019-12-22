package strategy;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:52
 */
public class OptionalMultiply implements MyStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
