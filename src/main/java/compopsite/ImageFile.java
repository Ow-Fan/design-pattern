package compopsite;

import lombok.Data;

/**
 * @description: leaf(叶子构建)：
 * 叶子构建可以说就是各种类型的文件！叶子构建没有子构件。它实现了抽象构建中的定义的行为
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:32
 */
@Data
public class ImageFile extends AbstractFile{

    private String name;

    private String type;

    public ImageFile(String name) {
        this.type = "img";
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        // todo 抛出异常， 文件叶子不支持容器操作
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        // todo 抛出异常， 文件叶子不支持容器操作
    }

    @Override
    public AbstractFile get(int i) {
        // todo 抛出异常， 文件叶子不支持容器操作
        return null;
    }

    @Override
    public void optionMethod() {
        System.out.println("ImageFile name:" + name + " type:" + type);
    }
}
