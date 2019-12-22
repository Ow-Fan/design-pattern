package facade;

/**
 * @description: 门面模式:外观模式 只对外提供接口，不关心具体实现
 * 以送信为例（写信，贴邮票，封信封，邮递四个过程）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 19:41
 */
public interface LetterProcess {

    /**
     * 写信
     */
    void writeLetter();

    /**
     * 贴邮票
     */
    void stamp();

    /**
     * 封信封
     */
    void envelope();

    /**
     * 邮递
     */
    void sendLetter();
}


