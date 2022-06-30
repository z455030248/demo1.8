package demo.observer;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 12:58
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        SubjectImpl subject = new SubjectImpl();

        ObserverImpl observer1 = new ObserverImpl();
        observer1.setObserverName("张三");
        ObserverImpl observer2 = new ObserverImpl();
        observer2.setObserverName("李四");
        ObserverImpl observer3 = new ObserverImpl();
        observer3.setObserverName("王五");

        subject.add(observer1);
        subject.add(observer2);
        subject.add(observer3);

        subject.setSendMsg("发工资了");
    }
}
