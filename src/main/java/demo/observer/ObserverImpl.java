package demo.observer;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName ObserverImpl
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 12:49
 * @Version 1.0
 */
@Setter
@Getter
public class ObserverImpl implements Observer {

    private Subject subject;

    private String observerName;

    @Override
    public void update(Subject subject) {
        System.out.println(observerName+"收到了"+((SubjectImpl)subject).getSendMsg());
    }
}
