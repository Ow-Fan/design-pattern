package compopsite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: compsite(子容器构建)：它在组合模式中表示容器节点对象，
 * 容器结点是子节点，可以是子容器，也可以是叶子构建，它提供一个集合来存储子节点
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:38
 */
@Data
public class Folder extends AbstractFile {

    private String name;

    private List<AbstractFile> abstractFiles = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        abstractFiles.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        abstractFiles.remove(abstractFile);
    }

    @Override
    public AbstractFile get(int i) {
        AbstractFile abstractFile = null;
        if (i > 0 && i < abstractFiles.size()) {
            abstractFile = abstractFiles.get(i);
        }
        return abstractFile;
    }

    @Override
    public void optionMethod() {
        System.out.println("Folder: name:" + name);
    }
}
