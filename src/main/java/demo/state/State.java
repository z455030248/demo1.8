package demo.state;

/**
 * @ClassName State
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 16:05
 * @Version 1.0
 */
public interface State {
    void handle(State state);
}
