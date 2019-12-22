package bridge;

import bridge.brand.XiaoMi;
import bridge.soft.Game;
import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 14:41
 */
public class BridgeTest {

    @Test
    public void PhoneTest() {
        Phone phone = new Phone();
        phone.setBrandInfo(new XiaoMi());
        phone.setSoftware(new Game());
        phone.start();

        phone.showPhoneInfo();
        phone.runSoftware();
    }
}
