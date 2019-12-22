package prototype;

import org.junit.Test;

/**
 * @description: 原型模式测试
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 14:24
 */
public class PrototypeTest {

    @Test
    public void prototypePattern_01() throws Exception{
        ProtoTypePattern_01 protoTypePattern_01 = new ProtoTypePattern_01();
        protoTypePattern_01.setName("Test");
        ProtoTypePattern_01 clone = protoTypePattern_01.clone();
        ProtoTypePattern_01 deepClone = protoTypePattern_01.deepClone();
        System.out.println("source:" + protoTypePattern_01 + protoTypePattern_01.hashCode());
        System.out.println("clone:" + clone + clone.hashCode());
        System.out.println("deepClone:" + deepClone + deepClone.hashCode());
    }
}
