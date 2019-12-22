package state;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:29
 */
public class MyStateStateTest {

    @Test
    public void MyState() {
        MyContext myContext = new MyContext();
        MyStartStateState myStartState = new MyStartStateState();

        myStartState.dpAction(myContext);

        System.out.println(myContext.getMyStateState().toString());

        MyStopStateState myStopState = new MyStopStateState();

        myStopState.dpAction(myContext);

        System.out.println(myContext.getMyStateState().toString());

    }
}
