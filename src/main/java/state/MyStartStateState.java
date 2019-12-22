package state;

/**
 * @description: 实体类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:27
 */
public class MyStartStateState implements MyStateState {
    @Override
    public void dpAction(MyContext myContext) {
        System.out.println("Player is in start state");
        myContext.setMyStateState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
