package observer;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:50
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
