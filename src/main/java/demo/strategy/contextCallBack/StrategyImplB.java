package demo.strategy.contextCallBack;

/**
 * @ClassName StrastgyImplB
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 15:38
 * @Version 1.0
 */
public class StrategyImplB implements Strategy {
    @Override
    public void algorithm(Bean bean) {
        System.out.println("算法实现B" + bean);
    }
}
