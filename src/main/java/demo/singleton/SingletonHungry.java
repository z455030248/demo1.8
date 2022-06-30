package demo.singleton;

/**
 * @ClassName SingletonHungry
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 12:10
 * @Version 1.0
 */
public class SingletonHungry {

    private static SingletonHungry singletonHungry=new SingletonHungry();

    private SingletonHungry(){

    }

    public static SingletonHungry getInstance(){
        return singletonHungry;
    }
}
