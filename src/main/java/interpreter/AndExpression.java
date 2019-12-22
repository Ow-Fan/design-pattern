package interpreter;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:11
 */
public class AndExpression implements MyExpression{

    private MyExpression myExpression1;

    private MyExpression myExpression2;

    public AndExpression(MyExpression myExpression1, MyExpression myExpression2) {
        this.myExpression1 = myExpression1;
        this.myExpression2 = myExpression2;
    }


    @Override
    public boolean interprect(String context) {
        return myExpression1.interprect(context) && myExpression2.interprect(context);
    }
}
