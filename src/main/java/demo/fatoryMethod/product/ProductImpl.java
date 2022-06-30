package demo.fatoryMethod.product;

/**
 * @ClassName ProductImpl
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 12:30
 * @Version 1.0
 */
public class ProductImpl implements Product{
    @Override
    public void doSomeThing() {
        System.out.println("产品实际做的事情");
    }
}
