package bridge;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 14:40
 */
public class Phone extends PhoneBridge {
    @Override
    public void start() {
        System.out.println("Phone start!");
    }
}
