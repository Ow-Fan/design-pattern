package template;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:56
 */
public class MyFootball extends MyGame {
    @Override
    void initialize() {
        System.out.println("MyFootball Game init...");
    }

    @Override
    void startPlay() {
        System.out.println("MyFootball Game playing...");
    }

    @Override
    void endPlay() {
        System.out.println("MyFootball Game end...");
    }
}
