package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 负责恢复状态
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:40
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
