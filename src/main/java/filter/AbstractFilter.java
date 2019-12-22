package filter;

import java.util.List;

/**
 * @description: 过滤器抽象类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:01
 */
public abstract class AbstractFilter {

    /**
     * 抽象方法 ，对入参的personList进行不同规则的过滤
     * @param personList
     * @return
     */
    public abstract List<Person> matchFilter(List<Person> personList);

}
