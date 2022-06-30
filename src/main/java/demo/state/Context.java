package demo.state;

/**
 * @ClassName Context
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 16:08
 * @Version 1.0
 */
public class Context {

    private State state;


    public Context(State state) {
        this.state = state;
    }


    public void leave(){
        if (!(state instanceof LeaderState)){
            System.out.println("错误");
        }else {
            state.handle(new ManagerState());
        }
    }


    public static void main(String[] args) {
        Context context = new Context(new LeaderState());
        context.leave();
    }
}
