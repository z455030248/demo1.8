package demo.strategy.contextCallBack;

/**
 * @ClassName Context
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 15:38
 * @Version 1.0
 */
public class Context {


    private Bean bean;

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public void doSomething(){
        strategy.algorithm(bean);
    }
}
