package mediator;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:29
 */
public class MyUser {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyUser(String name) {
        this.name = name;
    }

    public void showMessage(String message) {
         ChatRoom.showMessage(this, message);
    }
}
