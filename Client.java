package demo.proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:57
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Subject realySubiect = new RealySubiect();
        Proxy proxy = new Proxy(realySubiect);
        proxy.request();

    }
}
