package command;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 14:56
 */
public class SendCommand implements CommandInterface {

    public MyInvoker myInvoker = new MyInvoker();

    public MyInvoker getMyInvoker() {
        return myInvoker;
    }

    public void setMyInvoker(MyInvoker myInvoker) {
        this.myInvoker = myInvoker;
    }

    @Override
    public void execute() {
        String message = "SendCommand send Message...";
        myInvoker.setMessage(message);
        myInvoker.send(message);
    }
}
