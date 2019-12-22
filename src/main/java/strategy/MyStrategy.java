package strategy;

/**
 * @description: 策略模式（解决过多的ifelse以及相近的运行）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:49
 */
public interface MyStrategy {

    public int doOperation(int num1, int num2);
}
