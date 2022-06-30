package demo.observer;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName SubjectImpl
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 12:53
 * @Version 1.0
 */

public class SubjectImpl extends Subject{

    private  String sendMsg;

    public String getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(String sendMsg) {
        this.sendMsg = sendMsg;
        notifyObservers();
    }
}
