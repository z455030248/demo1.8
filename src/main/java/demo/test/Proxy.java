package demo.test;

/**
 * @ClassName Proxy
 * @Description 代理类，持有实际类的对象，在前后进行增强，实现同一个接口
 * @Author zhouchao
 * @Date 2022/4/10 11:55
 * @Version 1.0
 */
public class Proxy implements Subject{


    private Subject subject;

    public Proxy(Subject subject){
        this.subject=subject;

    }

    @Override
    public void request() {
        System.out.println("我是代理类，我在业务之前做了一些事情");
        subject.request();
    }
}
