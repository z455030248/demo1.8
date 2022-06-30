package demo.abstractFatory;

/**
 * @ClassName FatoryA
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:16
 * @Version 1.0
 */
public class FatoryA implements AbstarctFatory{
    @Override
    public AbstarctProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
