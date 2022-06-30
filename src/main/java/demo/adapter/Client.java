package demo.adapter;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 11:52
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();
        Adapter adapter = new AdapterImpl(adaptee);
        adapter.request();

    }
}
