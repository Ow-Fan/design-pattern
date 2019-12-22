package builder.inner;

import lombok.Data;

/**
 * @description: 内部类方式实现Builder
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 16:06
 */
@Data
public class InnerClass {

    private Integer id;

    private String name;

    private String sex;

    public static class Builder {

        private Integer id;

        private String name;

        private String sex;

        public Builder(Integer id) {
            this.id = id;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public InnerClass build() {
            return new InnerClass(this);
        }
    }

    private InnerClass(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.sex = builder.sex;
    }
}
