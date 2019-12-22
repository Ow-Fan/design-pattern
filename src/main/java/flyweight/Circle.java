package flyweight;

import com.sun.scenario.effect.impl.prism.PrImage;
import lombok.Data;

import java.awt.*;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 20:05
 */
@Data
public class Circle implements shape {

    private String color;

    private Integer radix;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println(color + "[Radix]:" + radix);
    }
}
