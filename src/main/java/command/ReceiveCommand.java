package command;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 14:58
 */
public class ReceiveCommand implements CommandInterface {

    private MyInvoker myInvoker;

    public ReceiveCommand(MyInvoker myInvoker) {
        this.myInvoker = myInvoker;
    }

    @Override
    public void execute() {
        myInvoker.receive(myInvoker);
    }
}
