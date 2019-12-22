package facade;

/**
 * @description: 送信的具体实现
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 19:45
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeLetter() {
        System.out.println("writer Letter...");
    }

    @Override
    public void stamp() {
        System.out.println("stamp Letter...");
    }

    @Override
    public void envelope() {
        System.out.println("envelope Letter...");
    }

    @Override
    public void sendLetter() {
        System.out.println("send Letter...");
    }
}
