package memento;

/**
 * @description: 备忘录模式（存储对象的状态）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:36
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
