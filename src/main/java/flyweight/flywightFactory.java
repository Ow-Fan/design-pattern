package flyweight;

import java.util.HashMap;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 20:34
 */
public class flywightFactory {

    private static final HashMap<String, shape> map = new HashMap<>();

    public static shape getShape(String color) {
        Circle circle = (Circle) map.get(color);
        if (circle == null) {
            circle = new Circle(color);
            map.put(color, circle);
        }
        return circle;
    }
}
