package demo.strategy.contextCallBack;

/**
 * @ClassName StrategyImplA
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 15:37
 * @Version 1.0
 */
public class StrategyImplA implements Strategy {
    @Override
    public void algorithm(Bean bean) {
        System.out.println("算法实现A"+bean);
    }
}
