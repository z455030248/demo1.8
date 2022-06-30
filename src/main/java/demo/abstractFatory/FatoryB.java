package demo.abstractFatory;

/**
 * @ClassName FatoryB
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:17
 * @Version 1.0
 */
public class FatoryB implements AbstarctFatory{
    @Override
    public AbstarctProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProcudctB2() ;
    }
}
