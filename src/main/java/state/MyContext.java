package state;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:26
 */
public class MyContext {

    private MyStateState myStateState;

    public MyContext() {
        this.myStateState = null;
    }


    public MyStateState getMyStateState() {
        return myStateState;
    }

    public void setMyStateState(MyStateState myStateState) {
        this.myStateState = myStateState;
    }



}
