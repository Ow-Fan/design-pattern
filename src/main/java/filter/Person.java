package filter;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 过滤器模式(又名标准模式Criteria Pattern)，过滤的对象定义
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 14:59
 */
@Data
public class Person implements Serializable {
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private String gender;

    /**
     * 名称
     */
    private String name;


}
