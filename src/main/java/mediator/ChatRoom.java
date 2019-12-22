package mediator;

import java.time.LocalDateTime;

/**
 * @description: 中介模式（聊天室例子想·）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:24
 */
public class ChatRoom {

    public static void showMessage(MyUser user, String message){
        System.out.println(LocalDateTime.now().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
