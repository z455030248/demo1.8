package demo.state;

/**
 * @ClassName LeaderState
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 16:06
 * @Version 1.0
 */
public class LeaderState implements State{
    @Override
    public void handle(State state) {
        System.out.println("组长处理");
        ManagerState managerState = new ManagerState();
        managerState.handle(this);
    }
}
