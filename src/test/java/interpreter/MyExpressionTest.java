package interpreter;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:13
 */
public class MyExpressionTest {

    @Test
    public void myExpressionTest() {
        TerminalExpression hello = new TerminalExpression("hello");
        TerminalExpression haha = new TerminalExpression("haha");
        AndExpression andExpression = new AndExpression(haha, hello);
        boolean interprect = andExpression.interprect("hello, hahaha");
        System.out.println(interprect);
    }
}
