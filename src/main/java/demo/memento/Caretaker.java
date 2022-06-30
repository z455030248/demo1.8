package demo.memento;

/**
 * @ClassName Caretaker
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 16:31
 * @Version 1.0
 */
public class Caretaker {

    private Memento memento;

    public void saveMemeto(Memento memento){
        this.memento=memento;
    }


    public Memento getMemento(){
        return memento;
    }
}
