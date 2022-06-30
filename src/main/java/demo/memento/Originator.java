package demo.memento;

/**
 * @ClassName originator
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 16:30
 * @Version 1.0
 */
public class Originator {

    public String context;


    public Memento createMemento(){
        return new MementoImpl(context);
    }


    public void setMemento(Memento memento){
        this.context=((MementoImpl) memento).getContext();
    }


    private class MementoImpl implements  Memento{

        private String context;

        public MementoImpl(String context) {
            this.context = context;
        }

        public String getContext(){
            return context;
        }
    }
}
