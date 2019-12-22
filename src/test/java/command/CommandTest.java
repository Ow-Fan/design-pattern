package command;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:00
 */
public class CommandTest {

    @Test
    public void commandTest() {
        SendCommand sendCommand = new SendCommand();
        sendCommand.execute();
        ReceiveCommand receiveCommand = new ReceiveCommand(sendCommand.myInvoker);
        receiveCommand.execute();
    }
}
