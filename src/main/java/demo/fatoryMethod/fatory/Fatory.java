package demo.fatoryMethod.fatory;

import demo.fatoryMethod.product.Product;

/**
 * @ClassName Fatory
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 12:30
 * @Version 1.0
 */
public abstract class Fatory {

    public abstract Product creatProduct();


    public void opertion(){
        Product product = creatProduct();
        product.doSomeThing();
    }
}
