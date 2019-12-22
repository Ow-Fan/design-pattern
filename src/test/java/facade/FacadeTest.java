package facade;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 19:49
 */
public class FacadeTest {

    @Test
    public void letterTest() {
        LetterFacade letterFacade = new LetterFacade();
        letterFacade.sendLetter("xx");
    }
}
