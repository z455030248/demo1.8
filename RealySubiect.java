package demo.proxy;

/**
 * @ClassName RealySubiect
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:55
 * @Version 1.0
 */
public class RealySubiect implements Subject{
    @Override
    public void request() {
        System.out.println("我是业务类，我做了实际的事情。");
    }
}
