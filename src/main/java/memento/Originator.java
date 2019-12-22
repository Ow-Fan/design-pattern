package memento;

/**
 * @description: 创建并存储Memento对象的状态
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:37
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
