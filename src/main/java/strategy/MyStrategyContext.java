package strategy;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:52
 */
public class MyStrategyContext {

    private MyStrategy strategy;

    public MyStrategyContext(MyStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
