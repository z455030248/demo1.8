package demo.singleton;

/**
 * @ClassName SingletonInner
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 12:19
 * @Version 1.0
 */
public class SingletonInner {


    private SingletonInner() {

    }


    static class SingletonIn {
        private static SingletonInner instance = new SingletonInner();

    }

    public SingletonInner getInstance() {
        return SingletonIn.instance;
    }
}
