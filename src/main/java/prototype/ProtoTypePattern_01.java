package prototype;

import lombok.Data;

import java.io.*;

/**
 * @description: 原型模式（实现Cloneable接口）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/7 13:48
 */
@Data
public class ProtoTypePattern_01 implements Cloneable, Serializable {

    private String name;

    /**
     * 浅复制
     * @return ProtoTypePattern_01
     * @throws CloneNotSupportedException
     */
    @Override
    public ProtoTypePattern_01 clone() throws CloneNotSupportedException {
        ProtoTypePattern_01 clone = (ProtoTypePattern_01) super.clone();
        return clone;
    }

    /**
     * 深复制
     * @return ProtoTypePattern_01
     * @throws CloneNotSupportedException
     */
    public ProtoTypePattern_01 deepClone() throws IOException, ClassNotFoundException {
        /*
        写入当前对象的二进制流
         */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /*
        读出二进制流产生的新对象
         */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ProtoTypePattern_01) ois.readObject();
    }
}
