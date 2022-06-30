package demo.state;

/**
 * @ClassName ManagerState
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 16:07
 * @Version 1.0
 */
public class ManagerState implements State{
    @Override
    public void handle(State state) {
        System.out.println(state.getClass().getSimpleName()+"同意了。"+"经理处理");
        DirectorState directorState = new DirectorState();
        directorState.handle(this);
    }
}
