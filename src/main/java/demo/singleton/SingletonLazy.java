package demo.singleton;

import java.time.Period;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 12:02
 * @Version 1.0
 */
public class SingletonLazy {

    private volatile static SingletonLazy singleton = null;

    //饿汉
    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (null == singleton) {
            synchronized (SingletonLazy.class) {
                if (null == singleton) {
                    singleton = new SingletonLazy();
                }
            }
        }
        return singleton;
    }


}
