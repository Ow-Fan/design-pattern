package filter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:08
 */
public class FilterTest {

    @Test
    public void filterTest() {
        ArrayList<Person> list = new ArrayList<>();
        for (int i=0; i<5; i++) {
            Person person = new Person();
            person.setAge(i);
            person.setName("person" + i);
            if (i % 2 == 0) {
                person.setGender("MALE");
            } else {
                person.setGender("FEMALE");
            }
            list.add(person);
        }

        MaleFilter maleFilter = new MaleFilter();
        List<Person> people = maleFilter.matchFilter(list);
        TenagerFilter tenagerFilter = new TenagerFilter();
        List<Person> people1 = tenagerFilter.matchFilter(list);
        System.out.println(people);
        System.out.println(people1);
    }
}
