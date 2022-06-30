package demo.adapter;

/**
 * @ClassName AdapterImpl
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 11:54
 * @Version 1.0
 */
public class AdapterImpl implements Adapter{
    private Adaptee adaptee;

    public AdapterImpl(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.doRequest();
    }
}
