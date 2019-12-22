package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体过滤实现类 过滤出青少年(年龄在14-30)
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:06
 */
public class TenagerFilter extends AbstractFilter{
    @Override
    public List<Person> matchFilter(List<Person> personList) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getAge() > 3 && person.getAge() < 30) {
                result.add(person);
            }
        }
        return result;
    }
}
