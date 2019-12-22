package template;

/**
 * @description: 模板模式（定义通用方法）
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 19:56
 */
public abstract class MyGame {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
