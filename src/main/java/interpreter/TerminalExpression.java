package interpreter;

import java.beans.Expression;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:09
 */
public class TerminalExpression implements MyExpression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interprect(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }

}
