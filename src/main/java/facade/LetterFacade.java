package facade;

/**
 * @description: 邮递员直接通过一个方法实现送信的四个功能
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 19:47
 */
public class LetterFacade {

    private LetterProcessImpl letterProcess = new LetterProcessImpl();

    /**
     * 一个方法实现所有的功能
     * @param context
     */
    public void sendLetter(String context) {
        letterProcess.writeLetter();
        letterProcess.stamp();
        letterProcess.envelope();
        letterProcess.sendLetter();
    }
}
