package demo.fatoryMethod.fatory;

import demo.fatoryMethod.product.Product;
import demo.fatoryMethod.product.ProductImpl;

/**
 * @ClassName FatoryImpl
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 12:32
 * @Version 1.0
 */
public class FatoryImpl extends Fatory{
    @Override
    public Product creatProduct() {
        return new ProductImpl();
    }
}
