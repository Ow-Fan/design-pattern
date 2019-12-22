package state;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:28
 */
public class MyStopStateState implements MyStateState {
    @Override
    public void dpAction(MyContext myContext) {
        System.out.println("Player is in stop state");
        myContext.setMyStateState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
