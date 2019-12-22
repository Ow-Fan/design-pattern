package command;

/**
 * @description: 命令模式 实现调用
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 14:53
 */
public class MyInvoker {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void send(String message) {
        System.out.println("MyInvoker send message: " + message);
    }

    public void receive(MyInvoker myInvoker) {
        System.out.println("MyInvoker receive message: " + myInvoker.message);
    }
}
