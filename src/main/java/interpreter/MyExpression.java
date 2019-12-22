package interpreter;

/**
 * @description: 解释器模式（定义一种语言规则）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:07
 */
public interface MyExpression {

    /**
     * 解析传入的内容
     * @param context
     * @return
     */
    boolean interprect(String context);
}
