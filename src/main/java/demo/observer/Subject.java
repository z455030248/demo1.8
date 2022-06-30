package demo.observer;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName subject
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 12:42
 * @Version 1.0
 */
public  class Subject {

    private List<Observer> observers =new ArrayList<>();


    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }


    protected void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
