package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体过滤实现类 过滤出为男性的人员
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:03
 */
public class MaleFilter extends AbstractFilter{
    @Override
    public List<Person> matchFilter(List<Person> personList) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : personList) {
            if ("MALE".equals(person.getGender())) {
                result.add(person);
            }
        }
        return result;
    }
}
