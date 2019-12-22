package bridge;

import bridge.brand.BrandInfo;
import bridge.soft.Software;
import lombok.Getter;
import lombok.Setter;

/**
 * @description: 桥接具体实现抽象类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 14:36
 */
@Getter
@Setter
public abstract class PhoneBridge {

    /**
     * 手机软件
     */
    protected Software software;

    /**
     * 手机品牌
     */
    protected BrandInfo brandInfo;

    public void runSoftware() {
        software.run();
    }

    public void showPhoneInfo() {
        brandInfo.showInfo();
    }

    public abstract void start();
}
