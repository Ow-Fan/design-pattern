package memento;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:41
 */
public class MementoTest {

    @Test
    public void memtoTest() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #4");

        System.out.println("Current state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state: " + originator.getState());
    }
}
