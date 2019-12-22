package mediator;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:31
 */
public class MediatorTest {

    @Test
    public void userChatTest() {
        MyUser l1 = new MyUser("l1");
        MyUser l2 = new MyUser("l2");

        l1.showMessage("hi ! l2");
        l2.showMessage("helloi l1");
    }
}
