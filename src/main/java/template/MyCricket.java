package template;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:56
 */
public class MyCricket extends MyGame {
    @Override
    void initialize() {
        System.out.println("MyCricket Game init...");
    }

    @Override
    void startPlay() {
        System.out.println("MyCricket Game playing...");
    }

    @Override
    void endPlay() {
        System.out.println("MyCricket Game end...");
    }
}
