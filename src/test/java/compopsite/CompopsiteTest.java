package compopsite;

import org.junit.Test;

import java.util.List;

/**
 * @description:
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/8 15:42
 */
public class CompopsiteTest {

    @Test
    public void test01() {
        Folder folder = new Folder("文件夹");
        ImageFile image01 = new ImageFile("Image01");
        ImageFile image02 = new ImageFile("Image02");
        ImageFile image03 = new ImageFile("Image03");
        folder.add(image01);
        folder.add(image02);
        List<AbstractFile> abstractFiles = folder.getAbstractFiles();
        System.out.println(abstractFiles);
        folder.optionMethod();
        image01.optionMethod();

    }
}
