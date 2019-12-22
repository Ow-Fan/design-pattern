package iterator;

import org.junit.Test;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 15:21
 */
public class MyIteratorTest {

    @Test
    public void nameContainerTest() {
        NameRepository namesRepository = new NameRepository();

        for(MyIterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
