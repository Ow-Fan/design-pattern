package chainofresponsibility;

/**
 * @description: 责任链模式 抽象日志处理类
 * @project: design-pattern
 * @author: Admin
 * @date: 2019/12/22 14:18
 */
public abstract class AbstractMyLogger {

    protected static int INFO = 1;
    protected static int DEBUG = 2;
    protected static int ERROR = 3;

    /**
     * 日志级别
     */
    protected int level;
    /**
     * 责任链下一节点
     */
    protected AbstractMyLogger nextLogger;

    public void setNextLogger(AbstractMyLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
