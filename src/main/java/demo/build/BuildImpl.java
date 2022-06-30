package demo.build;

/**
 * @ClassName BuildImpl
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:30
 * @Version 1.0
 */
public class BuildImpl implements Build{

    private  Product product;


    public Product getResource(){
        return  product;
    }
    @Override
    public void buildProduct() {
       //具体的构建
        product =new Product();
        product.setAge("1");

    }

    @Override
    public Product build() {
        return product;
    }
}
