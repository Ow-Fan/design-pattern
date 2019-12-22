package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 观察者模式，提供客户端绑定以及解绑方法
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:48
 */
public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
