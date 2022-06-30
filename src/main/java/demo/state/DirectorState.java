package demo.state;

/**
 * @ClassName DirectorState
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 16:07
 * @Version 1.0
 */
public class DirectorState implements State{
    @Override
    public void handle(State state) {
        System.out.println(state.getClass().getSimpleName()+"同意了。"+"总监处理");
        System.out.println("请假流程结束");
    }
}
